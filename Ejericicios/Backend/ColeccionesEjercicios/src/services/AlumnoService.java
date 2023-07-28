package services;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList();

    public void cargarAlumnos() {

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = input.next();

        ArrayList<Integer> notas = new ArrayList();

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la nota n°" + (i + 1) + ": ");
            notas.add(input.nextInt());
        }

        alumnos.add(new Alumno(nombre, notas));
    }

    public void mostrarAlumnos() {
        System.out.println(alumnos);
    }

    public boolean buscarAlumno(String alumno) {
        Iterator<Alumno> it = alumnos.iterator();

        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(alumno)) {
                return true;
            }
        }
        System.out.println("No se encontro el alumno");
        return false;
    }

    public double notaFinal(String alumno) {
        Iterator<Alumno> it = alumnos.iterator();

        Integer promedio = 0;

        while (it.hasNext()) {
            
            Alumno alumnoActual = it.next();
            if (alumnoActual.getNombre().equalsIgnoreCase(alumno)) {
                List<Integer> nota = alumnoActual.getNotas();
                for (int aux : nota) {
                    promedio += aux;
                }
            }
        }
        return promedio / 3;
    }
}
