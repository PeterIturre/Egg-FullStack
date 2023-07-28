package Main;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Date;

public class Ejercicio5Persona {

    public static void main(String[] args) {

        PersonaService ps = new PersonaService();
        
        Persona p = ps.crearPersona();
        
        System.out.println(ps.calcularEdad(new Date(), p.getFechaDeNacimiento()));
        
        System.out.println(ps.menorQue(p, new Date()));
        
        ps.mostrarPersona(p);

    }
}
