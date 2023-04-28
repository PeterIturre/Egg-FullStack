package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    Scanner input = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.print("Ingrese en nombre de la persona: ");
        String nombre = input.next();

        System.out.println("Ingrese la fecha de nacimiento de la persona: ");
        System.out.print("Dia:");
        int dia = input.nextInt();
        System.out.print("Mes:");
        int mes = input.nextInt();
        System.out.print("Año:");
        int anio = input.nextInt();

        return new Persona(nombre, new Date(anio - 1900, mes - 1, dia));
    }

    public long calcularEdad(Date fechaActual, Date fechaDeNacimiento) {
        return (int) Math.floor((fechaActual.getTime() - fechaDeNacimiento.getTime()) / 3.154e+10);
    }

    public boolean menorQue(Persona p, Date fecha) {
        return p.getFechaDeNacimiento().after(fecha);
    }

    public void mostrarPersona(Persona p) {
        System.out.println("El nombre de la persona es: " + p.getNombre());
        System.out.println("La fecha de nacimiento es: " + p.getFechaDeNacimiento());
    }
}
