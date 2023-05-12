package IntroPOO.Servicios;

import IntroPOO.Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioMascota {
    
    private Scanner input; 
    private List<String> mascotas;
    
    public ServicioMascota() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    public void crearMascota() {
        
        System.out.print("Introducir nombre");
        String nombre = input.next();
        
        System.out.print("Introducir apodo");
        String apodo = input.next();
        
        System.out.print("Introducir tipo");
        String tipo = input.next();
        
        mascotas.add(nombre + " " + apodo + " " + tipo);
    }
    
    public void mostrarMascota() {
        
        System.out.println("Las mascotas actuales de la lista mascotas son:");
        
        for (String i : mascotas) {
            System.out.println(i);
        }
        
        System.out.println("Cantidad = " + mascotas.size());
    }
    
}
