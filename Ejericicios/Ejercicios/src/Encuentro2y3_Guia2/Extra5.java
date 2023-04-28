package Encuentro2y3_Guia2;

import java.util.Scanner;

/*
Se pide ingresar una letra del alfabeto y mostrar si dicha letra es vocal o consonante.
 */
public class Extra5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        
        String letra = input.next().toLowerCase();

        // ARREGLAR CODIGO!!!
        System.out.println(letra);
        if ("aeiou".contains(letra)) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra es una consonante");
        }
    }
}
