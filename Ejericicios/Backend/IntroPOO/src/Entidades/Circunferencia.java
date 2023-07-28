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
*/

package Entidades;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Circunferencia {
    
    
    //Atributos
    private double radio;

    //Constructor
    public Circunferencia() {  
    }
    
    public Circunferencia(double radio) {
    }
    
    //Getters and Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Metodos
    public void CrearCircunferencia() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = input.nextFloat();
        //setRadio(input.nextFloat());
    }
    
    public double Area() {
        double area = 3.141592 * pow(radio, 2.0);
        return area;
    }
    
    public double Perimetro() {
        double perimetro = 3.141592 * radio * 2;
        return perimetro;
    }
}
