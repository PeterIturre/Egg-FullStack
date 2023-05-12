/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package Encuentro9a11_Guia5;

import java.util.Scanner;

public class Ejercicio5Antisimetrica {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] a = new int[3][3];
        boolean cond = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[j][i] * -1 + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            cond = false;
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == a[j][i] * -1) {
                    cond = true;
                } else {
                    cond = false;
                }
            }
        }
        System.out.println("Es la matriz antisimetrica? " + cond);
    }
}
