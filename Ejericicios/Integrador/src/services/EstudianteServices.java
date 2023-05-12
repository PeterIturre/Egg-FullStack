package services;

import entigades.Estudiante;
import java.util.Scanner;

public class EstudianteServices {

    Scanner input = new Scanner(System.in);

    public Estudiante cargarEstudiante() {

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese la nota final: ");
        double nota = input.nextInt();

        return new Estudiante(nombre, nota);
    }

    // Usando este metodo no tengo que
    // usar cargarEstudiante ni crear el vector en main
    public Estudiante[] vectorCargado() {
        Estudiante[] estudiantes = new Estudiante[8];

        estudiantes[0] = new Estudiante("Pedro", 10);
        estudiantes[1] = new Estudiante("Fede", 9);
        estudiantes[2] = new Estudiante("Raul", 5);
        estudiantes[3] = new Estudiante("Nacho", 8);
        estudiantes[4] = new Estudiante("Lauti", 6);
        estudiantes[5] = new Estudiante("Gaspar", 7);
        estudiantes[6] = new Estudiante("Elias", 7);
        estudiantes[7] = new Estudiante("Gaston", 8);

        return estudiantes;
    }

    public double promedioNotas(Estudiante estudiantes[]) {
        double suma = 0;
        for (Estudiante i : estudiantes) {
            suma += i.getNota();
        }
        return suma / estudiantes.length;
    }

    public String[] mayorPromedio(Estudiante estudiantes[]) {
        int contador = 0;

        for (Estudiante i : estudiantes) {
            if (i.getNota() > promedioNotas(vectorCargado())) {
                contador++;
            }
        }

        String[] promediosMayores = new String[contador];

        int j = 0;

        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedioNotas(vectorCargado())) {
                promediosMayores[j] = estudiantes[i].getNombre();
                j++;
            }
        }

        return promediosMayores;
    }
}
