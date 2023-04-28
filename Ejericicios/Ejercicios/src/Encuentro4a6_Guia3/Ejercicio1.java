/*
Crear un programa que dado un número determine si es par o impar.
 */
package Encuentro4a6_Guia3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        double num = input.nextDouble();

        if (num % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }
}
