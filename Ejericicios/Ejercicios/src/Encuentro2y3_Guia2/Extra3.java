package Encuentro2y3_Guia2;

import java.util.Scanner;

/*
Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al
usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
mostrar un mensaje por pantalla indicándolo.
 */
public class Extra3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su sueldo actual:");
        double sueldo = input.nextDouble();
        System.out.println("Ingrese el sueldo minimo:");
        double sueldoMin = input.nextDouble();

        if (sueldo > sueldoMin) {
            System.out.println("Su sueldo es mayor al minimo");
        } else {
            System.out.println("Su sueldo es menor al minimo");
        }
    }
}
