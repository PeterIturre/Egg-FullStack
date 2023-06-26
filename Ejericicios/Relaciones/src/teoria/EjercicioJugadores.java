package teoria;

import entidades.Equipo;
import entidades.Jugador;
import java.util.ArrayList;

public class EjercicioJugadores {

    public static void main(String args[]) {

        Jugador j = new Jugador("Pedro", "Iturre", "Defensor", 4);
        Jugador j1 = new Jugador("Maria", "Pene", "Delantero", 10);
        Jugador j2 = new Jugador("Juan", "Mannoia", "Medio Campista", 7);
        Jugador j3 = new Jugador("Silvina", "Aguilar", "Arquero", 1);

        ArrayList<Jugador> lista = new ArrayList();
        
        lista.add(j);
        lista.add(j1);
        lista.add(j2);
        lista.add(j3);
        
        Equipo e = new Equipo(lista);
        
        System.out.println(j);
        
        System.out.println(e);   
    }
}
