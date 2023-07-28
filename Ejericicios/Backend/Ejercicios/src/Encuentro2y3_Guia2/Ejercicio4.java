package Encuentro2y3_Guia2;


import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: 
F = 32 + (9 * C / 5).
 */

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grados;
        
        System.out.println("Ingrese la cantidad de grados centigrados:");
        grados = input.nextInt();
        System.out.println (grados + "°C equivalen a: " + 32 + (9 * grados / 5) + "°F");
    }
    
}
