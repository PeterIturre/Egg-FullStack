/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package EjerciciosPOO;

import Entidades.ExtraRectangulo;
import java.util.Scanner;

public class MainExtra6Rectangulo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ExtraRectangulo rectangulo1 = new ExtraRectangulo();
        
        System.out.println("El area del rectangulo es: "+ rectangulo1.calcular_area());
    }
}
