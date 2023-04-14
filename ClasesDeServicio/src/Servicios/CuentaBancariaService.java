package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaService {

    Scanner input = new Scanner(System.in);

    CuentaBancaria cb = new CuentaBancaria();

    public CuentaBancaria crearCuenta() {
        System.out.print("Ingrese su numero de cuenta: ");
        cb.setNumeroCuenta(input.nextInt());
        System.out.print("Ingrese su numero de DNI: ");
        cb.setDniCliente(input.nextLong());
        System.out.print("Ingrese su su saldo actual: ");
        cb.setSaldoActual(input.nextInt());

        return cb;
    }

    public double ingresar(double deposito) {
        cb.setSaldoActual(cb.getSaldoActual() + deposito);

        return cb.getSaldoActual();
    }

    public double retirar(double retiro) {

        if (cb.getSaldoActual() >= retiro) {
            cb.setSaldoActual(cb.getSaldoActual() - retiro);
        } else {
            cb.setSaldoActual(0);
        }

        return cb.getSaldoActual();
    }

    public double extraccionRapida() {
        cb.setSaldoActual(cb.getSaldoActual() * 0.8);

        return cb.getSaldoActual();
    }

    public double consultarSaldo() {
        return cb.getSaldoActual();
    }

    public void consultarDatos() {
        System.out.println(cb.toString());
    }
}
