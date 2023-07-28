/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package Encuentro9a11_Guia5;

import java.util.Scanner;

public class Extra3FuncionYVector {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese la dimension del vector: ");
        int n = input.nextInt();
        int[] vector = new int[n];

        Rellenador(vector, n);
        Impresora(vector, n);
    }

    public static int[] Rellenador(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        return vector;
    }

    public static void Impresora(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
}
