package Encuentro4a6_Guia3;

import java.util.Scanner;

/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
public class Teoria9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, i = 0, suma = 0;

        do {
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            suma = num + suma;
            if (num == 0) {
                System.out.println("Se capturo el 0");
                break;
            }
            i++;
        } while (i < 20);
        System.out.println("La suma de todos los numeros ingresados es: " + suma);
    }
}
