package Main;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaService;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CuentaBancariaService cbs = new CuentaBancariaService();
        CuentaBancaria cb = cbs.crearCuenta();

        int respuesta;

        do {

            System.out.println("Cajero Automatico");
            System.out.println("2------Deposito");
            System.out.println("3------Retirar");
            System.out.println("4------Extraccion Rapida (solo el 20%)");
            System.out.println("5------Consultar Saldo");
            System.out.println("6------Consultar Datos");
            System.out.println("7------Salir");

            System.out.print("Seleccione una opcion: ");
            respuesta = input.nextInt();

            switch (respuesta) {

                case 2:
                    System.out.print("Ingrese el monto: ");
                    cbs.ingresar(input.nextDouble());
                    break;
                case 3:
                    System.out.println("Retirando dinero...");
                    cbs.retirar(input.nextDouble());
                    break;
                case 4:
                    System.out.println("Retirando dinero...");
                    cbs.extraccionRapida();
                    break;
                case 5:

                    System.out.println(cbs.consultarSaldo());
                    break;

                case 6:

                    cbs.consultarDatos();
                    break;

                case 7:
                    System.out.println("Saliendo...............");
                    continue;

                default:
                    System.out.println("Opcion Invalida ");
            }
        } while (respuesta != 7);
    }
}
