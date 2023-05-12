/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Encuentro9a11_Guia5;

import java.util.Random;

public class Ejercicio3RecorrerVector {

    static Random rand = new Random();

    public static void main(String[] args) {

        int un = 0, dos = 0, tres = 0, cua = 0, cinco = 0;

        int n = rand.nextInt(100);
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(99999);
            System.out.println(vector[i]);

            if (vector[i] < 99999 && vector[i] > 9999) {
                cinco++;
            } else if (vector[i] <= 9999 && vector[i] > 999) {
                cua++;
            } else if (vector[i] <= 999 && vector[i] > 99) {
                tres++;
            } else if (vector[i] <= 99 && vector[i] > 9) {
                dos++;
            } else if (vector[i] <= 9 && vector[i] > 0) {
                un++;
            }
        }
        System.out.println("El N es: " + n);
        System.out.println("Hay " + cinco + " numeros de cinco digitos");
        System.out.println("Hay " + cua + " numeros de cuatro digitos");
        System.out.println("Hay " + tres + " numeros de tres digitos");
        System.out.println("Hay " + dos + " numeros de dos digitos");
        System.out.println("Hay " + un + " numeros de un digitos");
    }
}
