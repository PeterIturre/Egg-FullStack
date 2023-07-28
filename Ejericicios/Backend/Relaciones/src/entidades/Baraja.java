package entidades;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    ArrayList<Carta> cartas = new ArrayList();
    ArrayList<Carta> cartasMonton = new ArrayList();

    public Baraja() {

        for (int numero = 1; numero <= 12; numero++) {
            if (numero != 8 && numero != 9) {
                for (Palo palo : Palo.values()) {
                    cartas.add(new Carta(palo, numero));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public void siguienteCarta() {
        if (!cartas.isEmpty()) {
            System.out.println("La siguiente carta es: " + cartas.get(0));
            cartasMonton.add(cartas.get(0));
            cartas.remove(0);
        } else {
            System.out.println("No hay mas cartas en la baraja");
        }
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public void dasCartas(int num) {
        if (num < cartas.size()) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Carta numero " + (i + 1) + ": ");
                System.out.println(cartas.get(i));
                cartasMonton.add(cartas.get(i));
                cartas.remove(i);
            }
        }
    }

    public void cartasMonton() {
        System.out.println("Las cartas que estan en el monton son: ");
        for (Carta aux : cartasMonton) {
            System.out.println(aux);
        }
    }

    public void mostrarBaraja() {
        for (Carta aux : cartas) {
            System.out.println(aux);
        }
    }
}
