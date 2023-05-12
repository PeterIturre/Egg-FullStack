/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package Encuentro9a11_Guia5;

import java.util.Scanner;

public class Extra1SumaVector {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Indique el tamaño del vector: ");
        int suma = 0, n = input.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("n⁰" + (i + 1) + " : ");
            vector[i] = input.nextInt();
            suma += vector[i];
        }

        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}
