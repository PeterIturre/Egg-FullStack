package metodos;

public class DivicionNumero {

    public double DivicionNumero(double num1, double num2) {
        double div;

        try {
            div = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
            div = num1;
        }

        return div;
    }
}
