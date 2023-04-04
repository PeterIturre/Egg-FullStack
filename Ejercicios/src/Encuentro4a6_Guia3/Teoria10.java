package Encuentro4a6_Guia3;

import java.util.Scanner;

/*
Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
public class Teoria10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, num1, num2, num3, num4, num5;
        
        System.out.println("Ingrese 5 numeros que esten entre el 1 y el 20");
        num = 0;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        if ((num1 >= 20 || num1 <= 0) || (num2 >= 20 || num2 <= 0) || (num3 >= 20 || num3 <= 0) || (num4 >= 20 || num4 <= 0) || (num5 >= 20 || num5 <= 0)) {
            System.out.println("Uno de los numeros ingresados no esta dentro del intervalo deseado");
        } else {
            for (int i = 0; i < 5; i++) {
                switch (i) {
                    case 0:
                        num = num1;
                        break;
                    case 1:
                        num = num2;
                        break;
                    case 2:
                        num = num3;
                        break;
                    case 3:
                        num = num4;
                        break;
                    case 4:
                        num = num5;
                        break;
                }
                System.out.print(num + " ");
                
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
                
                System.out.println("");
            }
        }
    }
}
