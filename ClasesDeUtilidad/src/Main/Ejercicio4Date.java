package Main;

import Servicios.FechaService;

public class Ejercicio4Date {

    public static void main(String[] args) {

        FechaService fs = new FechaService();

        // Llamamos a diferenciaFechas y le pasamos por parametro la fecha actual y la fecha de nacimiento
        System.out.println("Tenes " + fs.diferenciaFechas(fs.fechaActual(), fs.fechaNaciminto()) + " años");

        // BORRAR CUANDO TERMINE EL CODIGO
        //fs.mostrarDatos(fs.fechaActual(), fs.fechaNaciminto());
    }
}
