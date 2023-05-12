package Main;

import Entidades.Curso;
import Servicios.CursoService;
import java.util.Scanner;

public class Ejercicio6Curso { 
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        CursoService cs = new CursoService();
        Curso c = cs.crearCurso();
        
        System.out.println("Haz ganado: $" + cs.calcularGananciaSemanal(c));
    }
}
