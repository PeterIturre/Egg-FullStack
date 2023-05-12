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
package EjerciciosPOO;

import Entidades.Juego;
import java.util.Scanner;


public class MainExtra3Juego {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Juego j1 = new Juego();
        
        int num1;
        
        System.out.print("Ingrese el numero a adivinar: ");
        num1 = input.nextInt();
        j1.setNum1(num1);
        
        System.out.println("Iniciando juego...");
        j1.iniciar_juego();
    }
}
