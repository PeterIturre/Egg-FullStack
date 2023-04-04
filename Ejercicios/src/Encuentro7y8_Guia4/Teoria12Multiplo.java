/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package Encuentro7y8_Guia4;

import java.util.Scanner;

public class Teoria12Multiplo {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingrese 2 numeros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("Los numeros son multiplos");
        }else{
            System.out.println("Los numros NO son multiplios");
        }    
    }
}
