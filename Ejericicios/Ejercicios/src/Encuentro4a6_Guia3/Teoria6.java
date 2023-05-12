package Encuentro4a6_Guia3;

import java.util.Scanner;

public class Teoria6 {

    /*
    Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = input.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Los 2 numeros ingresados son mayores a 25");
        } else if (num1 > 25) {
            System.out.println("El primer numero ingresado es mayor a 25");
        } else if (num2 > 25) {
            System.out.println("El segundo numero ingresado es mayor a 25");
        } else {
            System.out.println("Los 2 numeros ingresados son menores a 25");
        }
    }
}
