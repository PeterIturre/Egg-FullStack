package borrador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Colecciones {

    public static void main(String args[]) {

        System.out.println("-------------- ArrayList --------------");
        ArrayList<Integer> lista = new ArrayList();

        lista.add(40);
        lista.add(40);
        lista.add(20);
        lista.add(10);

        System.out.println(lista);

        
        System.out.println("-------------- removeIf --------------");
        ArrayList<String> listaPalabras = new ArrayList();

        listaPalabras.add("PEDRO");
        listaPalabras.add("FEDE");
        listaPalabras.add("RAFA");
        
        System.out.println(listaPalabras);

        listaPalabras.removeIf(i -> (i.equals("FEDE")));
        
        System.out.println(listaPalabras);

        System.out.println("-------------- HashSet --------------");
        HashSet<Integer> numeros = new HashSet();

        Integer y = 20;
        Integer x = 40;
        Integer z = 20;

        numeros.add(y);
        numeros.add(x);

        System.out.println(numeros);

        System.out.println("-------------- HashMap --------------");
        HashMap<Integer, String> persona = new HashMap<>();

        persona.put(43243106, "Pedro");
        persona.put(45132654, "Hugo");

        System.out.println(persona);

        //persona.remove(43243106);
        System.out.println(persona);

        System.out.println("-------------- forEach --------------");
        for (Integer i : numeros) {
            System.out.println(i);
        }

        for (Map.Entry<Integer, String> i : persona.entrySet()) {
            System.out.println(i);
        }

        for (Integer i : persona.keySet()) {
            System.out.println(i);
        }

        for (String i : persona.values()) {
            System.out.println(i);
        }

        System.out.println("-------------- Iterator --------------");
        Iterator iterator = lista.iterator();
        System.out.println("Elementos de la lista: ");

        iterator.hasNext();
        
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        ArrayList<String> bebidas = new ArrayList();

        bebidas.add("cafe");
        bebidas.add("té");
        bebidas.add("agua");
        bebidas.add("mate");

        System.out.println(bebidas);

        Iterator<String> it = bebidas.iterator();
        
        while (it.hasNext()) {
            if (it.next().equals("cafe")) {
                it.remove();
            }
        }

        System.out.println(bebidas);
    }
}
