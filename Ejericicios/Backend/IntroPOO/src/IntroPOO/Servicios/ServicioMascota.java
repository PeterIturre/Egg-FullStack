package IntroPOO.Servicios;

import IntroPOO.Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioMascota {

    private Scanner input;
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public Mascota crearMascota() {

        System.out.print("Introducir nombre: ");
        String nombre = input.next();

        System.out.print("Introducir apodo: ");
        String apodo = input.next();

        System.out.print("Introducir tipo: ");
        String tipo = input.next();

        return new Mascota(nombre, apodo, tipo);
    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void mostrarMascotas() {

        System.out.println("Las mascotas actuales de la lista mascotas son:");

        for (Mascota i : mascotas) {
            System.out.println(i);
        }

        System.out.println("Cantidad = " + mascotas.size());
    }

    public void fabricaMascota(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();

            agregarMascota(mascotaCreada);

            System.out.println(mascotaCreada.toString());
        }
    }

    //TODO agregar Try and Catch
//    public void actualizarMascota(int index) {
//        Mascota m = mascotas.get(index);
//        m.setApodo("Roberto");
//    }
    public void actualizarMascota(int index) {
        if (index <= mascotas.size()-1) {
            System.out.println("");
            System.out.println("---------------------------Actualizar---------------------------");
            
            Mascota m = crearMascota();
            
            mascotas.set(index, m);
        } else {
            System.out.println("El indeice es erroneo");
        }
    }

    public void eliminarMascota(int index) {
        if (index <= mascotas.size()-1) {
            mascotas.remove(index);
        } else {
            System.out.println("El indeice es erroneo");
        }
    }
}
