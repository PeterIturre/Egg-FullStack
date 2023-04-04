package Encuentro2y3_Guia2;

import java.util.Scanner;

/*
A partir de una conocida cantidad de días que el usuario ingresa a través del teclado,
escriba un programa para convertir los días en horas, en minutos y en segundos. Por
ejemplo
1 día = 24 horas = 1440 minutos = 86400 segundos
 */
public class Extra1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dias");
        int dias = input.nextInt();

        System.out.println(dias + " dias " + dias * 24 + " horas " + dias * 24 * 60 + " minutos " + dias * 24 * 60 * 60 + " segundos");
    }

}
