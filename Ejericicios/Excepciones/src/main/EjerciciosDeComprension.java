package main;

import java.util.Scanner;

public class EjerciciosDeComprension {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try {
            double resultado = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("ERROR " + e.getMessage());
        }
        System.out.println("Sentencia 4");
    }
    
}
