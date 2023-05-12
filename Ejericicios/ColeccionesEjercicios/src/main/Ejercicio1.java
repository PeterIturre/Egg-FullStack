package main;

import java.util.Scanner;
import services.PerroService;

public class Ejercicio1 {

    public static void main(String[] args) {

        PerroService ps = new PerroService();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lista Maestra de perros.");

        do {
            ps.agregarPerro();
            System.out.println("Quiere salir? (X)");
            
            if (input.next().equalsIgnoreCase("X")) {
                break;
            }            
        } while (true); 

        ps.mostrarPerro();
        
        System.out.println("Cual perro quiere eliminar?");
        
        ps.eliminarPerro(input.next());
        
        ps.mostrarPerro();
    }
}
