/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

2 7 6
9 5 1
4 3 8

 */
package Encuentro9a11_Guia5;

public class Ejercicio6CuadradoMagico {

    public static void main(String[] args) {

        int cuadrado[][] = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int base = 0, suma = 0;
        boolean cond = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cuadrado[i][j] + " ");
            }
            System.out.println("");
        }

        //FILAS
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    base += cuadrado[i][j];  // base = base + cuadrado[i][j]
                }
                suma += cuadrado[i][j];
            }
            if (suma != base) {
                cond = false;
            }
            suma = 0;
        }

        //COLUMNAS
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                suma += cuadrado[i][j];
            }
            if (suma != base) {
                cond = false;
            }
            suma = 0;
        }

        //DIAGONAL1
        for (int i = 0; i < 3; i++) {
            suma += cuadrado[i][i];
        }

        if (suma != base) {
            cond = false;
        }

        suma = 0;

        //DIAGONAL2   necesito: 0,2   1,1   2,0
        for (int i = 0; i < 3; i++) {
            suma += cuadrado[i][2 - i];
        }

        if (suma != base) {
            cond = false;
        }

        System.out.println("La suma es: " + base);
        System.out.println("Es la matriz una matriz magica? " + cond);
    }
}
