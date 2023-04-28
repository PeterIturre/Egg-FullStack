/*
Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 */
package Entidades;

import java.util.Scanner;

public class Operaciones {

    private float num1, num2;

    public Operaciones() {
    }

    public Operaciones(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();
    }

    public float sumar() {
        float suma = num1 + num2;
        return suma;
    }

    public float restar() {
        float resta = num1 - num2;
        return resta;
    }

    public float multiplicar() {
        float mult = 0;
        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR multiplicando por 0 (cero)");
        } else {
            mult = num1 * num2;
        }
        return mult;
    }
    
    public float dividir() {
        float  div = 0;
        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR dividiendo por 0 (cero)");
        } else {
            div = num1 / num2;
        }
        return div;
    }
}
