/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
*/
package EjerciciosPOO;

import Entidades.Cancion;
import java.util.Scanner;

public class MainExtra1Cancion {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Cancion c1 = new Cancion();
        
        System.out.println("Ingrese el nombre de la canción: ");
        c1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el nombre del autor: ");
        c1.setAutor(leer.nextLine());
        
        System.out.println(c1);
    }
}

