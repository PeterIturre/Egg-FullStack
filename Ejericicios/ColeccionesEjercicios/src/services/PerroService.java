package services;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PerroService {

    Scanner input = new Scanner(System.in);
    List<Perro> lista = new ArrayList();

    public Perro agregarPerro() {

        System.out.print("Ingrese el nombre del perro: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese el nombre del raza: ");
        String raza = input.nextLine();

        Perro p = new Perro(nombre, raza);
        
        lista.add(p);
        
        return p;
    }

    public void mostrarPerro() {
        System.out.println(lista);
    }
    
    public void eliminarPerro(String perro) {
        Iterator<Perro> it = lista.iterator();
        
        while (it.hasNext()) {
            
            if (it.next().getNombre().equalsIgnoreCase(perro)) {
                it.remove();
            } else {
                System.out.println("No se encontro el Perro");
            }
        }    
    }
}
