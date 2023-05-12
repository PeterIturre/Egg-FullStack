/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
 */
package EjerciciosPOO;

import Entidades.Puntos;
import java.util.Scanner;

public class MainExtra2Puntos {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Puntos p1 = new Puntos();
        
//        p1.crearPuntos(0, 0, 0, 0);
        
        System.out.println("Ingrese x1: ");
        p1.setX1(input.nextDouble());
        System.out.println("Ingrese y1: ");
        p1.setY1(input.nextDouble());
        System.out.println("Ingrese x2: ");
        p1.setX2(input.nextDouble());
        System.out.println("Ingrese y2: ");
        p1.setY2(input.nextDouble());
        
        System.out.println(p1.distanciaPuntos());

    }
}
