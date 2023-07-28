/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
*/
package EjerciciosPOO;

import Entidades.Cuenta;
import java.util.Scanner;

public class MainExtra4Cuenta {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Cuenta c1 = new Cuenta();
        
        System.out.print("Ingrese el titular de la cuenta: ");
        c1.setTitular(input.nextLine());
        System.out.print("Ingrese el saldo de la cuenta: ");
        c1.setSaldo(input.nextDouble());
        System.out.print("Ingrese la cantidad de dinero que desea retirar: ");
        c1.retirar_dinero(input.nextDouble());
    }
}
