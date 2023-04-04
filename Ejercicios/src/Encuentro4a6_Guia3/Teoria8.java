package Encuentro4a6_Guia3;

import java.util.Scanner;

/*
Escriba un programa que valide si una nota está  entre 0 y 10, sino está  entre 0
y 10. Se pedirá de nuevo hasta que la nota sea correcta.
 */
public class Teoria8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una nota entre 0 y 10");
        double nota = input.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese la nota correcta.");
            System.out.println("Entre 0 y 10");
            nota = input.nextDouble();
        }
        System.out.println("La nota esta entre 0 y 10");
    }
}
