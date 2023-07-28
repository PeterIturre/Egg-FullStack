package IntroPOO;

import IntroPOO.Servicios.ServicioMascota;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MascotAPP {

    public static void main(String[] args) {

        String[] nombres = {"Pepe", "Pepa"};

        List<String> nombresList = new ArrayList(Arrays.asList(nombres));

        ServicioMascota servMasc = new ServicioMascota();

        servMasc.fabricaMascota(2);

        servMasc.mostrarMascotas();

        servMasc.actualizarMascota(0);

        servMasc.mostrarMascotas();

        servMasc.eliminarMascota(0);
    }
}
