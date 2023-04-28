package Main;

import Entidades.Raices;
import Servicios.RaicesServicio;

public class Extra1Parabola {

    public static void main(String[] args) {

        RaicesServicio rs = new RaicesServicio();
        Raices r = rs.setCoeficientes();

        rs.calcular(r.getA(), r.getB(), r.getC());
    }
}
