package entidades;

import java.util.List;

public class Equipo {

    List<Jugador> plantel;

    public Equipo() {
    }

    public Equipo(List<Jugador> plantel) {
        this.plantel = plantel;
    }

    public List<Jugador> getPlantel() {
        return plantel;
    }

    public void setPlantel(List<Jugador> plantel) {
        this.plantel = plantel;
    }

    @Override
    public String toString() {
        return "Equipo{" + "plantel=" + plantel + '}';
    }
    
}
