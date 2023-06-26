
import java.util.Scanner;
import metodos.DivicionNumero;

public class Ejercicio3Excepciones {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese 2 numeros:");

        double num1;
        double num2;
        
        num1 = trier(input.next());
        num2 = trier(input.next());

        DivicionNumero dn = new DivicionNumero();

        System.out.println(dn.DivicionNumero(num1, num2));
    }

    public static int trier(String num) {
        int n;
        
        try {
            n = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("El formato esta mal.");
            return 0;
        }
        return n;
    }
}
