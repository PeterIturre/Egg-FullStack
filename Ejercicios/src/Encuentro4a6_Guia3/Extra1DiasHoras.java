/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package Encuentro4a6_Guia3;

import java.util.Scanner;

public class Extra1DiasHoras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un tiempo en minutos:");
        double min = input.nextDouble();

        System.out.println("El equialente en dias es:" + (min / 60 / 24) + " y el equivalente en horas es: " + (min / 60));
    }
}
