/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
2
 */
package EjerciciosPOO;

import Entidades.Circunferencia;

public class MainCircunferencia {

    public static void main(String[] args) {

        Circunferencia c1 = new Circunferencia();

        c1.CrearCircunferencia();
        c1.Area();
        c1.Perimetro();

        System.out.println("El area de la circunferencia es: " + c1.Area() + " El perimetro de la circunferencia es: " + c1.Perimetro());
    }
}
