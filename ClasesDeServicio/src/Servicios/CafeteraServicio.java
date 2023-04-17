package Servicios;

import Entidades.Cafetera;

public class CafeteraServicio {

    Cafetera c = new Cafetera();

    public void llenarCafetera() {
        c.setCantidadActual(c.getCapacidadMaxima());
    }

    public void servirTaza(int tamañoTaza) {

        if (tamañoTaza <= c.getCantidadActual()) {
            System.out.println("Sirviendo cafe...");
            c.setCantidadActual(c.getCantidadActual() - tamañoTaza);
        } else {
            System.out.println("Sirviendo el restante de cafe...");
            System.out.println("La taza tiene " + c.getCantidadActual() + "ml");
            c.setCantidadActual(0);
            System.out.println("No queda mas cafe en la cafetera.");
        }
    }

    public void vaciarCafetera() {
        c.setCantidadActual(0);
    }

    public void agregarCafe(int cafe) {
        c.setCantidadActual(cafe);

        if (c.getCantidadActual() > c.getCapacidadMaxima()) {
            System.out.println("Se revalso la cafetera...");
            c.setCantidadActual(c.getCapacidadMaxima());
        }

        System.out.println("La cafetera tiene " + c.getCantidadActual() + "ml de cafe");
    }
}
