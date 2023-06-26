package borradores;

import java.util.ArrayList;

public class Herencia {

    public static void main(String[] args) {
        ArrayList<Animal> listaAnimales = new ArrayList();
        
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        listaAnimales.add(a);
        listaAnimales.add(b);
        listaAnimales.add(c);
        
        for (Animal aux : listaAnimales) {
            aux.hacerRuido();
        }
    }
    
    static class Animal {
        public void hacerRuido() {
            System.out.println("Hola");
        }
    }
    
    static class Perro extends Animal {
        
        @Override
        public void hacerRuido() {
            System.out.println("Woof");
        }
    }
    
    static class Gato extends Animal {
        @Override
        public void hacerRuido() {
            System.out.println("Miau");
        }
    }
}
