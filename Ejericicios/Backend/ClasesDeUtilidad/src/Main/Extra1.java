package Main;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[3];

        do {
            System.out.print("Adivine el mes secreto: ");
            if (mesSecreto.equalsIgnoreCase(input.nextLine())) {
                System.out.println("Haz acertado");
                break;
            } else {
                System.out.println("Intente nuevamente");
            }
        } while (true);
    }
}
