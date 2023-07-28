/*
 Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package Encuentro7y8_Guia4;

import java.util.Scanner;

public class Ejercicio2Edades {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Edades();

        String salir;
        
        // terminar esta parte
        do {
            System.out.println("Quiere seguir ingresando datos? (S/N)");
            salir = input.next();
        } while (!"no".equalsIgnoreCase(salir));
    }

    public static void Edades() {
        System.out.println("Ingrese el nombre y la edad de la persona");
        String nombre = input.nextLine();
        int edad = input.nextInt();

        if (edad < 18) {
            System.out.println(nombre + " es menor de edad");
        } else {
            System.out.println(nombre + " es mayor de edad");
        }
    }
}
