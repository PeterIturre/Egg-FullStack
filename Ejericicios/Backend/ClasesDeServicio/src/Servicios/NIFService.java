package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class NIFService {

    Scanner input = new Scanner(System.in);
    NIF n = new NIF();

    public void crearNIF() {

        char[] verificador = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.print("Ingrese el numero de DNI: ");
        n.setDni(input.nextLong());

        //Como convertir un tipo de variable a otra (de long a int)
        //int variableInt = (int) variableLong;
        int resto = (int) n.getDni() % 23;

        n.setLetra(verificador[resto]);
    }

    public void mostrar() {
        System.out.println("Su NIF es: " + n.getDni() + "-" + n.getLetra());
    }
}
