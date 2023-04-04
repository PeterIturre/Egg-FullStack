/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.

*/
package Encuentro4a6_Guia3;

import java.util.Scanner;

public class Extra3Vocal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese una letra:");
        String letra = input.next();
        
        if ("aeiou".contains(letra)) {
            System.out.println("La letra ingresada es una vocal");
        }else{
            System.out.println("La letra ingresda es una consonante");
        }
    }
}
