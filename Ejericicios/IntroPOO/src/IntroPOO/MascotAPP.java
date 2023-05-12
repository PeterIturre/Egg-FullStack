package IntroPOO;


import IntroPOO.Servicios.ServicioMascota;


public class MascotAPP {

    public static void main(String[] args) {
        
        ServicioMascota servMasc = new ServicioMascota();
        
        servMasc.crearMascota();
        servMasc.crearMascota();
        
        servMasc.mostrarMascota();
    }
}
