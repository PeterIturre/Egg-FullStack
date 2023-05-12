package integrador;

import java.util.Arrays;
import services.EstudianteServices;

public class Integrador {

    public static void main(String[] args) {

        // creo el objeto servicio
        EstudianteServices es = new EstudianteServices();

        // creo el vector que almacena los objetos estudiantes
        //Estudiante[] estudiantes = new Estudiante[8];
        // cargo el vector con los estudiantes
        // for (int i = 0; i < estudiantes.length; i++) {
        // estudiantes[i] = es.cargarEstudiante();
        // }
        System.out.println("Estudiantes ya ingresados.");

        System.out.println("El promedio de notas es: " + es.promedioNotas(es.vectorCargado()));

        System.out.println("Los alumnos con la mayor nota son:");

        System.out.println(Arrays.toString(es.mayorPromedio(es.vectorCargado())));
    }
}
