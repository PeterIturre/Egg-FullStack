package entidades;

import java.util.Scanner;
import superCases.Electrodomestico;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, Integer precio, String color, Character consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        Scanner input = new Scanner(System.in);

        crearElectrodomestico();
        System.out.print("Ingrese la carga en kg: ");
        this.carga = input.nextInt();
    }

    @Override
    public void precioFinal(Character letra, Integer precio) {

        // ver si tengo que llamar al metodo precioFinal de Electrodomestico (Metodo padre)
        if (carga > 30) {
            precio = getPrecio() + 500;
        }
    }
}
