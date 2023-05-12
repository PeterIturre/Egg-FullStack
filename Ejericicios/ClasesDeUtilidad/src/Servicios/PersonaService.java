package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    Scanner input = new Scanner(System.in);
    
    public Persona crearPersona() {

        System.out.print("Ingrese en nombre de la persona: ");
        String nombre = input.next();

        System.out.println("Ingrese la fecha de nacimiento de la persona: ");
        System.out.print("Dia:");
        int dia = input.nextInt();
        System.out.print("Mes:");
        int mes = input.nextInt();
        System.out.print("Año:");
        int anio = input.nextInt();

        return new Persona(nombre, new Date(anio - 1900, mes - 1, dia));
    }
    
//    public Persona crearPersona() {
//        
//        Persona p1 = new Persona();
//        
//        System.out.println("Por favor ingrese su nombre");
//        p1.setNombre(input.next());
//
//        System.out.println("Ingrese su fecha de nacimiento");
//        System.out.println("Ingrese día");
//        int dia = input.nextInt();
//        System.out.println("Ingrese mes");
//        int mes = input.nextInt();
//        System.out.println("Ingrese año");
//        int anio = input.nextInt();
//        
//        Date d1 = new Date(anio, mes, dia);
//        
//        p1.setFechaDeNacimiento(d1);
//        
//        return p1;
//    }

    public long calcularEdad(Date fechaActual, Date fechaDeNacimiento) {
        return (int) Math.floor((fechaActual.getTime() - fechaDeNacimiento.getTime()) / 3.154e+10);
    }
    
//    public int  calcularEdad(Persona p1) {
//        return (int) (new Date().getTime() - p1.getFechaDeNacimiento().getTime() / 3.154e+10);
//    }

    public boolean menorQue(Persona p, Date fecha) {
        return p.getFechaDeNacimiento().before(fecha);
    }

    public void mostrarPersona(Persona p) {
        System.out.println("El nombre de la persona es: " + p.getNombre());
        System.out.println("La fecha de nacimiento es: " + p.getFechaDeNacimiento());
    }
}
