package Encuentro4a6_Guia3;

import java.util.Scanner;

/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
public class Ejercicio8Cuadrado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de lados del cuadrado:");
        int lado = input.nextInt();

        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {

                if (i == 0 || i == lado-1) {
                    System.out.print("* ");
                } else if (j == 0 || j == lado-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
