package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosService {

    public ParDeNumeros mostrarValores() {
        ParDeNumeros nums = new ParDeNumeros();
        System.out.println("El numero 1 es: " + nums.getNum1() + " El numero 2 es: " + nums.getNum2());
        return nums;
    }

    public double devolverMayor(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public double calcularPotencia(double num1, double num2) {
        if (num1 > num2) {
            return Math.pow(Math.round(num1), Math.round(num2));
        } else {
            return Math.pow(Math.round(num2), Math.round(num1));
        }
    }

    public double calculaRaiz(double num1, double num2) {
        if (num1 < num2) {
            return Math.sqrt(Math.abs(num1));
        } else {
            return Math.sqrt(Math.abs(num2));
        }
    }
}
