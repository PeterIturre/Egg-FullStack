package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoService {

    Scanner input = new Scanner(System.in);

    public void cargarAlumnos(Curso c) {
        String[] alumno = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre alumno n°: " + i);
            alumno[i] = input.nextLine();
        }

        c.setAlumnos(alumno);

    }
}
