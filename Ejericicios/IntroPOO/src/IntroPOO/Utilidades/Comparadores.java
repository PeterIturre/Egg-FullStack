package IntroPOO.Utilidades;

import IntroPOO.Entidades.Mascota;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Mascota> ordenarPorNombreDec = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t1.getNombre().compareToIgnoreCase(t.getNombre());
        }
    };
  
    public static Comparator<Mascota> ordenarPorEdad = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t1.getEdad().compareTo(t.getEdad());
        }
    };
}
