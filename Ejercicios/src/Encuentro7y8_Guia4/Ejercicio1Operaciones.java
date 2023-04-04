/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package Encuentro7y8_Guia4;

import java.util.Scanner;

public class Ejercicio1Operaciones {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese 2 numeros:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Que queres hacer?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        int menu = input.nextInt();

        while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5) {
            System.out.println("Ingresaste un numero incorrecto");
            System.out.println("Que queres hacer?");
            menu = input.nextInt();
        }

        switch (menu) {
            case 1:
                System.out.println(Suma(num1, num2));
                break;
            case 2:
                System.out.println(Resta(num1, num2));
                break;
            case 3:
                System.out.println(Multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println(Division(num1, num2));
                break;
        }
    }

    public static int Suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int Resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static double Division(int num1, int num2) {
        return num1 / num2;
    }
}
