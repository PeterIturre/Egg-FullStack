/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package Encuentro4a6_Guia3;

import java.util.Scanner;

public class Extra7ValMaxs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuantos valores va a ingresar?");
        int n = input.nextInt();
        int num, min = 0, max = 0, suma = 0, i = 0;

        while (i < n) {
            System.out.println("Ingrese el valor numero: " + (i + 1));
            num = input.nextInt();
            if (i == 0) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            suma += num;
            i++;
        }
        System.out.println("El maximo valor ingresado fue: " + max);
        System.out.println("El minimo valor ingresado fue: " + min);
        System.out.println("El promedio te todos los valores ingresados fue: " + suma / i);
        System.out.println("La suma de todos los valores es: " + suma);
    }
}
