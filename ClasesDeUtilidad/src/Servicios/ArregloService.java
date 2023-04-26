package Servicios;

import java.util.Arrays;

public class ArregloService {

    // Le pone valores a todo el arreglo aleatoreamente
    public void inicializarA(double[] arreglo) {
        Arrays.setAll(arreglo, i -> Math.random() * 10);

        //for (int i = 0; i < arreglo.length; i++) {
        //    arreglo[i] = Math.random() * 10;
        //}
    }

    // toString de arreglos
    public void mostrar(double[] arreglo) {

        System.out.println(Arrays.toString(arreglo));

        //for (double i : arreglo) {
        //    System.out.print("[" + i + "] ");
        //}
    }

    // lo multiplica por -1 lo arregla y lo vuelve a multiplicar por -1
    public void ordenar(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (arreglo[i] * -1);
        }

        Arrays.sort(arreglo);

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (arreglo[i] * -1);
        }
    }

    public void inicializarB(double[] arregloA, double[] arregloB) {
        
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        
        Arrays.fill(arregloB, 10, 20, 0.5);
    }
}
