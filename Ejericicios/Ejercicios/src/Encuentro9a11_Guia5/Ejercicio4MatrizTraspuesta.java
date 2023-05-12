/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package Encuentro9a11_Guia5;

public class Ejercicio4MatrizTraspuesta {

    public static void main(String[] args) {

        int[][] a = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] = (int) (Math.random() * 10));
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        System.out.println("");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println("");
        }

    }
}
