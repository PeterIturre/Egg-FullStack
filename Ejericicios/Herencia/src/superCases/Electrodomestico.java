package superCases;

import java.util.Scanner;

public class Electrodomestico {

    protected Integer precio;
    protected String color;
    protected Character consumoEnergetico;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, Character consumoEnergetico, Integer peso) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(Character letra) {
        switch (letra.toString().toLowerCase()) {
            case "a":
                this.consumoEnergetico = 'A';
                break;
            case "b":
                this.consumoEnergetico = 'B';
                break;
            case "c":
                this.consumoEnergetico = 'C';
                break;
            case "d":
                this.consumoEnergetico = 'D';
                break;
            case "e":
                this.consumoEnergetico = 'E';
                break;
            default:
                this.consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {
        switch (color.toLowerCase()) {
            case "blanco":
                this.color = "Blanco";
                break;
            case "negro":
                this.color = "Negro";
                break;
            case "rojo":
                this.color = "Rojo";
                break;
            case "azul":
                this.color = "Azul";
                break;
            case "gris":
                this.color = "Gris";
                break;
            default:
                this.color = "Blanco";
        }
    }

    public void crearElectrodomestico() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el color: ");
        this.color = input.next();
        System.out.print("Ingrese el consumo energetico: ");
        this.consumoEnergetico = input.next().charAt(0);
        System.out.print("Ingrese el peso: ");
        this.peso = input.nextInt();
        
        this.precio = 1000;
        
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
    }
    
    public void precioFinal(Character letra, Integer precio) {
        switch (letra.toString().toLowerCase()) {
            case "a":
                this.precio = 1000; 
                break;
            case "b":
                this.precio = 800;
                break;
            case "c":
                this.precio = 600;
                break;
            case "d":
                this.precio = 500;
                break;
            case "e":
                this.precio = 300;
                break;
            case "f":
                this.precio = 100;
                break;
        }
        
        if (peso >= 1 && peso <= 19) {
            this.precio = 100;
        }
        
        if (peso >= 20 && peso <= 49) {
            this.precio = 500;
        }
        
        if (peso >= 50 && peso <= 79) {
            this.precio = 800;
        }
        
        if (peso > 80) {
            this.precio = 1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
}
