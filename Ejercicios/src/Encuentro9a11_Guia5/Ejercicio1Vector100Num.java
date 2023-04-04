/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package Encuentro9a11_Guia5;

public class Ejercicio1Vector100Num {

    public static void main(String[] args) {

        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
            System.out.print(vector[i] + " ");
        }

        System.out.println("");

        for (int i = vector.length-1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
    }
}
