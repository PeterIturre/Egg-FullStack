/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
package Encuentro9a11_Guia5;

import java.util.Scanner;

public class Extra4NotasProfesores {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] alumnos = new int[10][5];
        int aprobado = 0, desaprobado = 0;

        //Ingresa los datos:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    System.out.println("Alumno " + (i + 1) + ": ");
                }
                if (j >= 0 && j < 2) {
                    System.out.print("Nota trabajo practico " + (j + 1) + ": ");
                    // alumnos[i][j] = input.nextInt();
                    alumnos[i][j] = (int) (Math.random() * 11);
                }
                if (j > 0) {
                    System.out.print("Nota integrador " + j + ": ");
                    // alumnos[i][j] = input.nextInt();
                    alumnos[i][j] = (int) (Math.random() * 11);
                }
            }
            System.out.println("");
        }

        //Imprime la matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + alumnos[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.print("El promedio de cada nota es: ");
        
        //Calcula el promedio index == 4
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                alumnos[i][4] += alumnos[i][j];
            }
        }
        
        System.out.println("");
        
        //Contador para aprobados y desaprobados
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + alumnos[i][4] + "]");
            if ((alumnos[i][4]/4) >= 7) {
                aprobado++;
            } else {
                desaprobado++;
            }
        }
        System.out.println("");
        System.out.println("Hay " + aprobado + " aprobados y " + desaprobado + " desaprobados.");
    }
}
