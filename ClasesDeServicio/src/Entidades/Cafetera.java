package Entidades;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;  

    public Cafetera() {
        this.capacidadMaxima = 100;
        this.cantidadActual = 0;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }   
}
