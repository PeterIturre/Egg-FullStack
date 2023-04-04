package Encuentro2y3_Guia2;

import java.util.Scanner;

/*
Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso
actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el porcentaje
puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
cantidad total de niños, y la cantidad total de niñas que hay en el curso.
 */
public class Extra2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de chicos");
        int num1 = input.nextInt();
        System.out.println("Ingrese la cantidad de chicas");
        int num2 = input.nextInt();

        System.out.println("El porcentaje de chicos es " + (num1 * 100) / (num1 + num2) + " %");
        System.out.println("El porcentaje de chicas es " + (num2 * 100) / (num1 + num2) + " %");
    }

}
