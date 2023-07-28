package Servicios;

import Entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;

public class CursoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos(Curso c) {
        String[] alumno = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre alumno n°" + (i + 1) + " : ");
            alumno[i] = input.next();
        }

        c.setAlumnos(alumno);
    }

    public Curso crearCurso() {

        Curso c = new Curso();

        System.out.print("Ingrese el nombre del curso: ");
        c.setNombreCurso(input.nextLine());
        System.out.print("Ingrese la cantidad de horas: ");
        c.setCantidadHorasPorDia(input.nextDouble());
        System.out.print("Ingrese de dias a la semana: ");
        c.setCantidadDiasPorSemana(input.nextInt());
        System.out.print("Turno: MAÑANA/TARDE: ");
        c.setTurno(input.next().charAt(0));
        System.out.print("Precio por hora: ");
        c.setPrecioPorHora(input.nextDouble());

        cargarAlumnos(c);

        return c;
    }

    public double calcularGananciaSemanal(Curso c) {
        System.out.println(Arrays.toString(c.getAlumnos()));
        return c.getCantidadHorasPorDia() * c.getPrecioPorHora() * 5 * c.getCantidadDiasPorSemana();
    }
}
