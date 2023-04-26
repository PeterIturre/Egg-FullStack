package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {

    Scanner input = new Scanner(System.in);
    Raices r = new Raices();

    public Raices setCoeficientes() {
        System.out.println("Ingrese los coeficientes en orden:");
        System.out.print("Ingrese el valor de a: ");
        r.setA(input.nextDouble());
        System.out.print("Ingrese el valor de b: ");
        r.setB(input.nextDouble());
        System.out.print("Ingrese el valor de c: ");
        r.setC(input.nextDouble());
        return r;
    }

    public double getDiscriminante(double a, double b, double c) {
        double discriminante = (b * b) - 4 * a * c;
        return discriminante;
    }

    public boolean tieneRaices(double discriminante) {
        if (discriminante > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz(double discriminante) {
        if (discriminante == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices(double a, double b, double c) {

        if (tieneRaices(getDiscriminante(a, b, c))) {
            System.out.println("X1 = " + (-b + Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a));
            System.out.println("X2 = " + (-b - Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a));
        }
    }

    public void obtenerRaiz(double a, double b, double c) {
        if (tieneRaiz(getDiscriminante(a, b, c))) {
            System.out.println("X = " + (-b + Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a));
        }
    }

    public void calcular(double a, double b, double c) {
        if (tieneRaices(getDiscriminante(a, b, c))) {
            System.out.println("Tiene raices.");
            System.out.println("Sus soluciones son: ");
            obtenerRaices(a, b, c);
        } else if (tieneRaiz(getDiscriminante(a, b, c))) {
            System.out.println("Tiene UNA raiz unica");
            System.out.println("Su solucion es: ");
            obtenerRaiz(a, b, c);
        } else {
            System.out.println("NO tiene raices.");
        }
    }
}
