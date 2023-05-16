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

        boolean x = false;

        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(perro)) {
                it.remove();

                x = true;
            }
        }

        if (x) {
            System.out.println(perro + " se ha eliminado correctamente");
        } else {
            System.out.println(perro + " no se encuentra en la lista");
        }
    }
}
