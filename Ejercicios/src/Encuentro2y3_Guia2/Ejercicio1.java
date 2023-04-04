package Encuentro2y3_Guia2;


import java.util.Scanner;

/*
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingrese 2 numeros a ser sumados");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("La suma de " + num1 + " y de " + num2 + " es " + (num1+num2));
    }
    
}
