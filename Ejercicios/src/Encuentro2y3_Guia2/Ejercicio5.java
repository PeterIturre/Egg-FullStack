package Encuentro2y3_Guia2;


import java.util.Scanner;

/*
 Escribir un programa que lea un número entero por teclado y muestre
 por pantalla el doble, el triple y la raíz cuadrada de ese número.
 Nota: investigar la función Math.sqrt().
 */

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero:");
        num = input.nextInt();
        
        System.out.println("El doble del numero ingresado es:" + num*2 );
        System.out.println("El triple del numero ingresado es:" + num*3);
        System.out.println("La raiz cuadrada es:" + Math.sqrt(num));
    }
    
}
