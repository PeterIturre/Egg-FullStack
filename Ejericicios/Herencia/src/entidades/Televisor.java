package entidades;

import java.util.Scanner;
import superCases.Electrodomestico;

public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(Integer Resolucion, boolean TDT, Integer precio, String color, Character consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = Resolucion;
        this.tdt = TDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer Resolucion) {
        this.resolucion = Resolucion;
    }

    public boolean isTDT() {
        return tdt;
    }

    public void setTDT(boolean tdt) {
        this.tdt = tdt;
    }

       /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
    */
    
    public void crearTelevisor() {
        Scanner input = new Scanner(System.in);
        
        crearElectrodomestico();
        
        System.out.print("Ingrese la resolucion del televisor: ");
        resolucion = input.nextInt();
        System.out.print("Tiene sintonizador TDT el televisor (S/N)");
        
        if (input.next().equalsIgnoreCase("s")) {
            tdt = true;
        } else {
            tdt = false;
        }                
    }
    
}
