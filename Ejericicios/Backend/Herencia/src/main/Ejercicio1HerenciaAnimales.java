package main;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class Ejercicio1HerenciaAnimales {

    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Lola", "Carnivoro", 7, "Cjs");
        perro1.alimentarse(perro1);
        
        Animal perro2 = new Perro("Chiquito", "Alto pu", 16, "Caniche");
        perro2.alimentarse(perro2);
        
        Animal gato1 = new Gato("Michi", "Vegano", 10, "Egipcio");
        gato1.alimentarse(gato1);
        
        Animal caballo1 = new Caballo("Lola", "Vegetariano", 8, "Regalado");
        caballo1.alimentarse(caballo1);
        
        Animal caballo2 = new Caballo("Caballito", "Omnivoro", 71, "sad");
        caballo2.alimentarse2();
    }
}
