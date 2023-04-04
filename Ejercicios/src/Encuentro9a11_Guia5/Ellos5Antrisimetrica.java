package Encuentro9a11_Guia5;

public class Ellos5Antrisimetrica {

    public static void main(String[] args) {

        int matriz[][] = {{0, (-2), 4}, {2, 0, 2}, {(-4), (-2), 0}};
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("(" + matriz[i][j] + ")");
            }
            System.out.println("");
        }
        
        System.out.println("\n");
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("(" + matriz[i][j] + ")");
            }
            System.out.println("");
        }
        
        boolean ban = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i] * (-1)) {
                    ban = false;
                    break;
                }
            }
        }
        
        System.out.println("Es antisimétrica? " + ban);
    }
}
