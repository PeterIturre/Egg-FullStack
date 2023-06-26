package ejercicios;

import entidades.Baraja;

public class JuegoDeCartas {

    public static void main(String[] args) {

        Baraja b = new Baraja();
        
        b.mostrarBaraja();
        System.out.println("------------------------------------------------");
        b.barajar();
        System.out.println("Barajando");
        System.out.println("------------------------------------------------");
        b.mostrarBaraja();
        System.out.println("------------------------------------------------");
        b.siguienteCarta();
        System.out.println("------------------------------------------------");
        b.mostrarBaraja();
        System.out.println("------------------------------------------------");
        b.siguienteCarta();
        System.out.println("------------------------------------------------");
        b.siguienteCarta();
        System.out.println("------------------------------------------------");
        b.dasCartas(5);
        System.out.println("------------------------------------------------");
        System.out.println("Las cartas disponibles son: " + b.cartasDisponibles());
        System.out.println("------------------------------------------------");
        b.cartasMonton();
    }
}
