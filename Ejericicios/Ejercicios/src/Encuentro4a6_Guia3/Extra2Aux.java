/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar
 */
package Encuentro4a6_Guia3;

public class Extra2Aux {

    public static void main(String[] args) {

        int aux, a = 1, b = 2, c = 3, d = 4;
        System.out.println("Valores iniciales:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);

        aux = a;
        System.out.println("A = " + (a = d));
        System.out.println("D = " + (d = b));
        System.out.println("B = " + (b = c));
        System.out.println("C = " + (c = aux));
    }
}
