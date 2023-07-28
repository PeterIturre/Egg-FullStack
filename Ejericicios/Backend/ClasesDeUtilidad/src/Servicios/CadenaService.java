package Servicios;

import Entidades.Cadena;

public class CadenaService {

    public int mostrarVocales(Cadena c) {
        int vocales = 0;

        for (int i = 0; i < c.getLongitudFrase(); i++) {
            if (c.getFrase().substring(i, i + 1).equalsIgnoreCase("a") || c.getFrase().substring(i, i + 1).equalsIgnoreCase("e") || c.getFrase().substring(i, i + 1).equalsIgnoreCase("i") || c.getFrase().substring(i, i + 1).equalsIgnoreCase("o") || c.getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {
                vocales++;
            }
        }
        return vocales;
    }

    public String invertirFrase(Cadena c) {
//        String fraseInv = "";
//
//        for (int i = c.getLongitudFrase(); i > 0; i--) {
//            fraseInv = fraseInv.concat(c.getFrase().substring(i - 1, i));
//        }
//        return fraseInv;

        StringBuilder builder = new StringBuilder(c.getFrase());

        return builder.reverse().toString();
    }

    public int vecesRepetido(Cadena c, String letra) {
        int repetido = 0;

        for (int i = 0; i < c.getLongitudFrase(); i++) {
            if (c.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                repetido++;
            }
        }
        return repetido;
    }

    public boolean compararLongitud(Cadena c, String frase) {
        return c.getFrase().equals(frase);
    }

    public String unirFrases(Cadena c, String frase) {
        return c.getFrase().concat(frase);
    }

    public String reemplazar(Cadena c, String letra) {
        return c.getFrase().replace("a", letra);
    }

    public boolean contiene(Cadena c, String letra) {
        return c.getFrase().contains(letra);
    }
}
