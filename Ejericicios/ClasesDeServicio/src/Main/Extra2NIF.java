package Main;

import Servicios.NIFService;

public class Extra2NIF {

    public static void main(String[] args) {
        
        System.out.println("Calcularemos su NIF.");
        
        NIFService ns = new NIFService();
        
        ns.crearNIF();
        ns.mostrar();
    }
}
