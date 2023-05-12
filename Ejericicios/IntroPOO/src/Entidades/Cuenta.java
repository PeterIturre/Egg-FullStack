/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package Entidades;

import java.util.Scanner;

public class Cuenta {

    Scanner input = new Scanner(System.in);

    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar_dinero(double retiro) {
        System.out.println("Hola " + titular);
        while (saldo < retiro) {
            System.out.println("No se puede retirar un monto mayor a saldo.");
            System.out.println("Intente ingresando otro monto.");
            retiro = input.nextDouble();
        }

        System.out.println("Retirando $" + retiro);
        System.out.println("Su saldo restante es: $" + (saldo - retiro));
    }
}
