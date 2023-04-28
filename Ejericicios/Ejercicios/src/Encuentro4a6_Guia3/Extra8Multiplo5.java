/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package Encuentro4a6_Guia3;

import java.util.Scanner;

public class Extra8Multiplo5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, par = 0, impar = 0, i = 0;

        do {
            System.out.println("Ingrese el valor numero: " + (i + 1));
            num = input.nextInt();
            if (num % 2 == 0) {
                par++;
            }else{
                impar++;
            }
            i++;
        } while (num % 5 != 0);
        
        System.out.println("La cantidad de numeros ingresados fueron: " + i);
        System.out.println("La cantidad de numeros pares fueron: " + par);
        System.out.println("La cantidad de numeros impares fueron: " + impar);
    }
}
