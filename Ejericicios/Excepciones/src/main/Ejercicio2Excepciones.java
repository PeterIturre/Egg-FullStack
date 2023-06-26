
import java.util.Scanner;

public class Ejercicio2Excepciones {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[3];

        System.out.print("Ingrese la cantidad de elementos a cargar el array: ");
        int n = input.nextInt();

        try {
            for (int i = 0; i < n; i++) {
                array[i] = i;
            }

            for (int i = 0; i < n; i++) {
                System.out.println("[" + array[i] + "]");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Te pasas nico...");
        }
    }
}
