/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
*/
package EjerciciosPOO;

import Entidades.Empleado;
import java.util.Scanner;

public class MainExtra5Empleado {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Empleado e1 = new Empleado();
        
        System.out.println("Ingrese su nombre.");
        e1.setNombre(input.nextLine());
        System.out.println("Ingrese su edad.");
        e1.setEdad(input.nextInt());
        System.out.println("Ingrese su salario actual.");
        e1.setSalario(input.nextDouble());  
        
        e1.calcular_aumento();
    }
}
