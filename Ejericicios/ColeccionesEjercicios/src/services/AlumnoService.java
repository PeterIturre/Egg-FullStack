package services;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
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
            } else {
                System.out.println("No se encontro el alumno");
                return false;
            }
        } 
        return false;
    }
    
    //TODO 
    public double notaFinal(String alumno) {
        Iterator<Alumno> it = alumnos.iterator();
        
        //it.next().getNombre().get
        //return ;
    //}
}
