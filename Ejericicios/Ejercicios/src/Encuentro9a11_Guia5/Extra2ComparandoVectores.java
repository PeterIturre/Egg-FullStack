/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package Encuentro9a11_Guia5;

import java.util.Scanner;

public class Extra2ComparandoVectores {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño de los vectores: ");
        int n = input.nextInt();

        int[] v1 = new int[n];
        int[] v2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Vector 1: n⁰" + (i + 1) + " : ");
            v1[i] = input.nextInt();
            System.out.println("Vector 2: n⁰" + (i + 1) + " : ");
            v2[i] = input.nextInt();
        }

        int i = 0;

        while (v1[i] == v2[i]) {
            System.out.println("[" + v1[i] + "]");
            System.out.println("[" + v2[i] + "]");
            i++;
        }

        if (i != n) {
            System.out.println("Los vectores no son iguales en el indice: " + i);
        } else {
            System.out.println("Los vectores son iguales");
        }
    }
}
