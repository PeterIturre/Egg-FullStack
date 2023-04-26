package Main;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;
import java.util.Scanner;

public class Ejercicio2Operaciones {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ParDeNumerosService ns = new ParDeNumerosService();
        ParDeNumeros num = ns.mostrarValores();

        int menu;

        do {

            System.out.println("1. Devolver el mayor numero.");
            System.out.println("2. Calcular la potencia.");
            System.out.println("3. Calcular la raiz.");
            System.out.println("4. Salir.");

            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("El mayor numero es: " + ns.devolverMayor(num.getNum1(), num.getNum2()));
                    ;
                    break;
                case 2:
                    System.out.println("La potencia del Mayor elevado al menor es: " + ns.calcularPotencia(num.getNum1(), num.getNum2()));
                    break;
                case 3:
                    System.out.println("La raiz del Mayor es: " + ns.calculaRaiz(num.getNum1(), num.getNum2()));
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (menu != 4);
    }
}
