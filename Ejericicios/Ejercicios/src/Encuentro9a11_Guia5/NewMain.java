package Encuentro9a11_Guia5;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];
        int name = 1;
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que introduzca los números del cuadrado
        System.out.println("Introduce los números del cuadrado mágico:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado[i][j] = sc.nextInt();
            }
        }

        // Comprobamos que los números introducidos son válidos
        boolean numerosValidos = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    numerosValidos = false;
                    break;
                }
            }
        }
        if (!numerosValidos) {
            System.out.println("Error: Los números introducidos deben estar entre 1 y 9.");
            return;
        }

        // Comprobamos si el cuadrado es mágico
        int suma = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        boolean esMagico = true;
        for (int i = 1; i < 3; i++) {
            if (cuadrado[i][0] + cuadrado[i][1] + cuadrado[i][2] != suma) {
                esMagico = false;
                break;
            }
            if (cuadrado[0][i] + cuadrado[1][i] + cuadrado[2][i] != suma) {
                esMagico = false;
                break;
            }
        }
        if (cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2] != suma) {
            esMagico = false;
        }
        if (cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0] != suma) {
            esMagico = false;
        }

        // Imprimimos por pantalla si el cuadrado es mágico o no
        if (esMagico) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }
}
