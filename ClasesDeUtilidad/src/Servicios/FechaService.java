package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner input = new Scanner(System.in);

    // Retorna fecha (El formato es AAAA/MM/DD)
    public Date fechaNaciminto() {

        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Dia: ");
        int dia = input.nextInt();
        System.out.print("Mes: ");
        int mes = input.nextInt() - 1;
        System.out.print("Año: ");
        int anio = input.nextInt() - 1900;

        Date fecha = new Date(anio, mes, dia);

        return fecha;
    }

    // Retorna fechaActual (El constructor vacio devuelve la fecha actual del sistema)
    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    // Para saber si vamos bien, al finalizar el ejercicio lo borramos
    public void mostrarDatos(Date fechaActual, Date fechaNacimiento) {
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.toString());
        System.out.println("Fecha actual: " + fechaActual.toString());
    }

    // Hacemos la diferencia entre la fecha actual y la fecha de nacimiento
    public int diferenciaFechas(Date fechaActual, Date fechaNacimiento) {
        return (int) Math.floor((fechaActual.getTime() - fechaNacimiento.getTime()) / 3.154e+10);
    }

}
