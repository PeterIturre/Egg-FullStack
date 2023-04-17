package Main;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

public class Cafe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c = new Cafetera();

        do {

            System.out.println("------- Cafeteria -------");
            System.out.println("1------ Llenar cafetera");
            System.out.println("2------ Vaciar cafetera");
            System.out.println("3------ Servir cafe");
            System.out.println("4------ Agregar cafe");
            System.out.println("5--------- Salir ---------");
            System.out.println("");
            System.out.println("La capacidad maxima de la cafetera es: " + c.getCapacidadMaxima() + " ml");

            System.out.print("Seleccione una opcion: ");

            switch (input.nextInt()) {

                case 1:
                    System.out.println("Llenando cafetera...");
                    cs.llenarCafetera();
                    System.out.println("La cafetera tiene " + c.getCantidadActual() + " ml");
                    break;
                case 2:
                    System.out.println("Vaciando cafetera...");
                    cs.vaciarCafetera();
                    System.out.println("La cafetera tiene " + c.getCantidadActual() + "ml");
                    break;
                case 3:
                    System.out.println("Sirviendo cafe...");
                    System.out.print("Cuanto cafe quiere servir en la taza: ");
                    cs.servirTaza(input.nextInt());
                    System.out.println("La taza tiene " + c.getCantidadActual());
                    break;
                case 4:
                    System.out.println("Agregando cafe...");
                    System.out.print("Cuanto cafe quiere agregar: ");
                    cs.agregarCafe(input.nextInt());
                    break;
                case 5:
                    continue;
                default:
                    System.out.println("Opcion Invalida ");
            }
        } while (true);
    }
}
