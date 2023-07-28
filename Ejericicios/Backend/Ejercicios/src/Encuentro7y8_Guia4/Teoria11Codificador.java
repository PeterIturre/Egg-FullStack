/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.

Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
 */
package Encuentro7y8_Guia4;

import java.util.Scanner;

public class Teoria11Codificador {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingrese una frase: ");
        String frase = input.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(Codificador(frase.substring(i, i + 1)));
        }   
        System.out.println("");
    }

    public static String Codificador(String letra) {

        switch (letra.toLowerCase()) {
            case "a":
                letra = "@";
                break;
            case "e":
                letra = "#";
                break;
            case "i":
                letra = "$";
                break;
            case "o":
                letra = "%";
                break;
            case "u":
                letra = "*";
                break;
        }
        return letra;
    }
}
