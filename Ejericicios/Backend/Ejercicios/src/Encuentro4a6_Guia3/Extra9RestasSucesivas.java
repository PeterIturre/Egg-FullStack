/*
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
 */
package Encuentro4a6_Guia3;

import java.util.Scanner;

public class Extra9RestasSucesivas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        i = 0;
        System.out.print("Ingrese un numero:");
        int num = input.nextInt();
        System.out.print("Ingrese el numero por cual quiere dividirlo:");
        int divisor = input.nextInt();


        do {
            num -= divisor;
            i++;
        } while (num > divisor);
        
        System.out.println("El cociente es: " + i + " y el residuo es: " + num);
    }
}
