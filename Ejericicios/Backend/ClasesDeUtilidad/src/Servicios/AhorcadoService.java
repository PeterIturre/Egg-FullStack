package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    Scanner input = new Scanner(System.in);

    public Ahorcado crearJuego() {

        System.out.print("Ingrese la palabra a buscar: ");
        Ahorcado a = new Ahorcado(input.nextLine());

        System.out.print("Ingrese la cantidad de jugadas maxima: ");
        a.setJugadasMaximas(input.nextInt());

        return a;
    }

    public int longitud(Ahorcado a) {
        return a.getBuscar().length;
    }
}
