/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.

Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo
*/
package Encuentro9a11_Guia5;

import java.util.Scanner;

public class Teoria13 {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        String[] equipo = new String[10]; 
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.print("Ingrese el nombre del compañero " + (i+1) + ": ");
            equipo[i] = input.next();
        }
  
       String aux = "";
       
       System.out.println("* Equipo:");
       
        //bucle for "mejorado" 
        for (String nombre: equipo){
           aux = aux + " " + nombre; //para concatenar
        }
    
        System.out.println(aux);
    }
}
