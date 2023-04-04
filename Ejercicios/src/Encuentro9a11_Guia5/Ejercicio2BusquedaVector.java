/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package Encuentro9a11_Guia5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2BusquedaVector {

    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        System.out.print("Ingrese el tamaño del vector: ");
        int n = input.nextInt();

        int[] v = new int[n];

        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(10);
            System.out.print(v[i] + " ");
        }

        System.out.print("Que valor quiere rescatar? ");
        int rescate = input.nextInt();

        int j = 0;
        String aux = "";

        for (int i = 0; i < v.length; i++) {
            if (rescate == v[i]) {
                j++;
                aux += "/" + i;
            }
        }
        if (j > 1) {
            System.out.println("Hay " + j + " numero/s en el vector y se sus posiciones son: " + aux);
        } else {
            System.out.println("No hay ningun numero igual al ingresado");
        }
    }
}
