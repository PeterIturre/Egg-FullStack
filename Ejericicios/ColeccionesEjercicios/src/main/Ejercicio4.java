package main;

import java.util.Scanner;
import services.PeliculaService;

public class Ejercicio4 {

    static Scanner input = new Scanner(System.in).useDelimiter("\n");
    static PeliculaService ps = new PeliculaService();

    public static void main(String[] args) {

        do {
            ps.cargarPelicula();
            System.out.print("Desea seguir cargando peliculas? (S/N): ");
        } while (input.nextLine().equalsIgnoreCase("s"));

        ps.mostrarPeliculas();

        System.out.println("Las peliculas mayores a 1 hora son");
        ps.mostrarPeliculasMayor();
        System.out.println("");

        System.out.println("Ordenando las peliculas de mayor a menor duracion");
        ps.mostrasPeliculasMayorAmenor();
        System.out.println("");

        System.out.println("Ordenando las peliculas de menor a mayor duracion");
        ps.mostrasPeliculasMenorAmayor();
        System.out.println("");

        System.out.println("Ordenando las peliculas alfabeticamente por titulo");
        ps.ordenPorTitulo();
        System.out.println("");

        System.out.println("Ordenando las peliculas alfabeticamente por director");
        ps.ordenPorDirector();
        System.out.println("");
    }
}
