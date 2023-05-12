package Main;

import Entidades.Cadena;
import Servicios.CadenaService;
import java.util.Scanner;

public class Ejercicio1Cadena {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);//.useDelimiter("\n");
        CadenaService cs = new CadenaService();
        
        System.out.print("Ingrese una frase: ");
        Cadena c = new Cadena(input.nextLine());
        
        System.out.println("Las vocales de la frase son: " + cs.mostrarVocales(c));
        
        
        
        System.out.println("La frase invetida es: " + cs.invertirFrase(c));
        
        System.out.print("Ingrese la letra que quiere ver si se repite: ");
        System.out.println("la letra ingresada se repite se repite: " + cs.vecesRepetido(c, input.nextLine()));
        
        System.out.print("Ingrese una frase para comparar: ");
        System.out.println(cs.compararLongitud(c, input.nextLine()));
        
        System.out.print("Ingrese una frase para unir:");
        System.out.println("Uniendo las frases: " + cs.unirFrases(c, input.nextLine()));
        
        System.out.print("Ingrese una letra para remplazar la (a): ");
        System.out.println("Reemplazando la letra (a) por: " + cs.reemplazar(c, input.next()));
        
        System.out.print("Ingrese la letra que quiere saber si contiene: ");
        System.out.println(cs.contiene(c, input.next()));
    }
}
