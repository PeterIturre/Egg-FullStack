package Encuentro2y3_Guia2;

import java.util.Scanner;

/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas
 y después toda en minúsculas.
 Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase:");
        frase = input.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }
    
}
