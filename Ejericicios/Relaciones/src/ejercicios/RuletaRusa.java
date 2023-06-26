package ejercicios;

import entidades.Juego;
import entidades.JugadorRuleta;
import entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class RuletaRusa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Revolver r = new Revolver();
        Juego juego = new Juego();

        System.out.println("Cuantos jugadores son? (6 MAX)");
        int cantidadJugadores = input.nextInt();

        if (cantidadJugadores > 6 || cantidadJugadores < 1) {
            System.out.println("La cantidad ingresada es incorrecta, ahora junta a 6 locos");
            cantidadJugadores = 6;
        }
        
        ArrayList<JugadorRuleta> jugadores = new ArrayList();
        
        for (int i = 0; i < cantidadJugadores; i++) {
            String nombre = "Jugador: ";
            jugadores.add(new JugadorRuleta(i, nombre));
        }
        
        r.llenarRevolver();
        
        juego.llenarJuego(jugadores, r);
        juego.ronda();  // TODO no se muere el jugador 6. termina el bucle en siguiente ronda y no dispara el juego
    }
}
