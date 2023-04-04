package Encuentro2y3_Guia2;

import java.util.Scanner;

/*
Construir un código que permita ingresar un número, si el número es mayor de
500, se debe calcular y mostrar en pantalla el 18% de este.
 */
public class Extra4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero:");

        double num = input.nextDouble();

        if (num > 500) {
            System.out.println("El 18% de " + num + " es:" + num * 0.18);
        } else {
            System.out.println("El numero ingresado es menor a 500");
        }
    }
}
