/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package Entidades;

public class ExtraRectangulo {

    public int lado1 = 4, lado2 = 6;

    public int calcular_area() {
        return lado1 * lado2;
    }
}
