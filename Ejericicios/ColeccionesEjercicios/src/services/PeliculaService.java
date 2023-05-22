package services;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import utilidades.PeliculasComparator;

public class PeliculaService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    List<Pelicula> ListaPeliculas = new ArrayList();
    
    public void cargarPelicula() {
        System.out.println("----- Cargando pelicula -----");
        System.out.print("Ingrese el titulo: ");
        String titulo = input.next();
        System.out.print("Ingrese el director: ");
        String director = input.next();
        System.out.print("Ingrese la duracion: ");
        double duracion = input.nextDouble();
        
        ListaPeliculas.add(new Pelicula(titulo,director,duracion));
    }
    
    public void mostrarPeliculas () {
        System.out.println(ListaPeliculas);
    }
    
    public void mostrarPeliculasMayor () {
        Iterator<Pelicula> it = ListaPeliculas.iterator();
        
        while (it.hasNext()) {
            Pelicula peliculaActual = it.next();
            if (peliculaActual.getDuracion() >= 1) {
                System.out.print(peliculaActual.getTitulo() + " ");
            }      
        }
    }
    
    public void mostrasPeliculasMayorAmenor () {
        Collections.sort(ListaPeliculas, PeliculasComparator.compararDeMayorAmenor);
        System.out.println(ListaPeliculas);
    }
    
    public void mostrasPeliculasMenorAmayor () {
        Collections.sort(ListaPeliculas, PeliculasComparator.compararDeMenorAmayor);
        System.out.println(ListaPeliculas);
    }
    
    public void ordenPorTitulo () {
        Collections.sort(ListaPeliculas, PeliculasComparator.compararPorTitulo);
        System.out.println(ListaPeliculas);
    }
    
    public void ordenPorDirector () {
        Collections.sort(ListaPeliculas, PeliculasComparator.compararPorDirector);
        System.out.println(ListaPeliculas);
    }
}
