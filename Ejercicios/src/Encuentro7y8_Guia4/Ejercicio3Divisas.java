/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
package Encuentro7y8_Guia4;

import java.util.Scanner;

public class Ejercicio3Divisas {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingrese la cantidad de euros que tiene: ");
        double euros = input.nextDouble();
        System.out.print("Ingrese la divisa a la que quiere convertir: ");
        String moneda = input.next().toLowerCase();

        Divisas(euros, moneda);
    }

    public static void Divisas(double euros, String moneda) {

        switch (moneda) {
            case "libra":
                System.out.println(euros + " euros equivalen a " + euros * 0.86 + " libras");
                break;
            case "dolar":
                System.out.println(euros + " euros equivalen a " + euros * 1.28611 + " dolares");
                break;
            case "yen":
                System.out.println(euros + " euros equivalen a " + euros * 129.852 + " yenes");
                break;
        }
    }
}
