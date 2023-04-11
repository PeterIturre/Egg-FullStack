package EjerciciosPOO;

import Entidades.Operaciones;

public class MainOperaciones {
    public static void main(String[] args) {
        
        Operaciones o1 = new Operaciones();
        
        o1.crearOperacion();
        System.out.println(o1.sumar());
        System.out.println(o1.restar());
        System.out.println(o1.multiplicar());
        System.out.println(o1.dividir());
    }
}
