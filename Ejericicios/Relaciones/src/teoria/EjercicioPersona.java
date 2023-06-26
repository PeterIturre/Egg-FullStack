package teoria;

import entidades.DNI;
import entidades.Persona;
import java.util.Scanner;

public class EjercicioPersona {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Persona p = new Persona("Pedro", "Iturre", new DNI("F", 43243106));
        
        System.out.println(p.getNombre());
        System.out.println(p.getApellido());
        System.out.println(p.getDocumento().getSerie());
        System.out.println(p.getDocumento().getNumero());
    }
}
