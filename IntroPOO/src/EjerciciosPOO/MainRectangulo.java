/*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
package EjerciciosPOO;

import Entidades.Rectangulo;
import java.util.Scanner;

public class MainRectangulo {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        
        System.out.print("Ingrese la base del rectangulo: ");
        int base = leer.nextInt();
        System.out.print("Ingrese la altura del rectangulo: ");
        int altura = leer.nextInt();
        
        r1.crearRectangulo(base, altura);
        System.out.println(r1.perimetro());
        System.out.println(r1.superficie());
        r1.dibujador(); 
    }
}
