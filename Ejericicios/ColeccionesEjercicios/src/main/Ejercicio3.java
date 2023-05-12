package main;

import java.util.Scanner;
import services.AlumnoService;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AlumnoService as = new AlumnoService();

        do {
            as.cargarAlumnos();

            System.out.print("Quiere seguir cargando alumnos? (S/N): ");

            if (input.next().equalsIgnoreCase("n")) {
                System.out.println("Saliendo del sistema... ");
                break;
            }
            
        } while (true);

        as.mostrarAlumnos();

        System.out.println("Ingrese el nombre del alumno para calcular la nota final: ");
        
        if (as.buscarAlumno(input.next())) {
            System.out.println("La nota final del alumno es: "+ as.notaFinal());
        }
        
    }

}
