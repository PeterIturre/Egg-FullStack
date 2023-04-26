package Main;

import Servicios.ArregloService;

public class Ejercicio2Arreglos {

    public static void main(String[] args) {
        
        ArregloService as = new ArregloService();
        
        double[] a = new double[50];
        double[] b = new double[20];
        
        as.inicializarA(a);
        
        as.mostrar(a);
        System.out.println("");
        as.ordenar(a);
        
        as.mostrar(a);
        
        as.inicializarB(a, b);
        
        as.mostrar(b);
        
    }
}
