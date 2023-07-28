package entidades;

import java.util.ArrayList;

public class Juego {

    ArrayList<JugadorRuleta> jugadores;
    Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<JugadorRuleta> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<JugadorRuleta> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<JugadorRuleta> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

    public void llenarJuego(ArrayList<JugadorRuleta> jugadores, Revolver r) {
        this.jugadores = jugadores;
        revolver = r;
    }

    public void ronda() {
        for (JugadorRuleta aux : jugadores) {

            if (aux.disparo(revolver)) {
                System.out.println("Juego terminado..." + aux.getNombre() + " " + aux.getId() + " murio");
                break;
            } else {
                System.out.println("El " + aux.getNombre() + " " + aux.getId() + " se salvo");
                System.out.println("Siguiente ronda.");
            }
        }
    }
}
