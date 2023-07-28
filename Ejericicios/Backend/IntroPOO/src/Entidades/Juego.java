/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
*/
package Entidades;

import java.util.Scanner;

public class Juego {

    private int num1, num2;

    public Juego() {
    }

    public Juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void iniciar_juego() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            if (i == 3) {
                System.out.println("GAME OVER");
                break;
            }
            
            setNum2(input.nextInt());
            
            if (num1 == num2) {
                System.out.println("A adivinado el numero");
                break;
            } else if (num1 > num2) {
                System.out.println("El numero es MENOR");
            } else if (num2 > num1) {
                System.out.println("El numero es MAYOR");
            }
        }
    }
}
