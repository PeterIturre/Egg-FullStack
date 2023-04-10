package IntroPOO;

import IntroPOO.Entidades.Mascota;
import java.util.Scanner;

public class MascotAPP {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mascota m1 = new Mascota("Fernando Chiquito", "Chiquito", "Perro");

        m1.setNombre("Pepe chiquito");
        
        System.out.println(m1.toString());
        
        m1.pasear(100);
        
        System.out.println(m1.toString());
    }
}
