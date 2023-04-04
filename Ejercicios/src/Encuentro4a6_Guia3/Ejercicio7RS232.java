/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package Encuentro4a6_Guia3;

import java.util.Scanner;

public class Ejercicio7RS232 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fde;
        int i = 0, j = 0;

        do {
            System.out.println("Ingrese una cadena que empiece con X y terminen con O y contenga 5 caracteres");
            fde = input.nextLine();

            if (fde.length() == 5 && fde.substring(0, 1).equals("X") && fde.substring(4, 5).equals("O")) {
                i++;
                System.out.println("FDE CORRECTO");
            } else {
                if ("&&&&&".equals(fde)) {
                    break;
                }
                j++;
                System.out.println("FDE INCORRECTO");
            }    
            
        } while (!"&&&&&".equals(fde));
        System.out.println("El FDE se ingreso correctamente: " + i + " veces.");
        System.out.println("El FDE se ingreso incorrectamente: " + j + " veces.");
    }
}
