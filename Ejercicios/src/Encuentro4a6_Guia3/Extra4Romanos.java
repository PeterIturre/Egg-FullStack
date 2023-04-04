/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
*/
package Encuentro4a6_Guia3;

import java.util.Scanner;

public class Extra4Romanos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        do {      
            System.out.print("Ingrese un numero entre el 1 y el 10: ");
            num = input.nextInt();
        } while (num < 0 && num > 11);
        
        switch (num) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:  
                System.out.println("X");
                break;
        }
    }
}
