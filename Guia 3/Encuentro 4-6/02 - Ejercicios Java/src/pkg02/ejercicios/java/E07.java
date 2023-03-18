/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ejercicios.java;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String cadena;
        
        while(true) {
            
            System.out.print("Ingrese una cadena (&&&&& para salir): ");
            cadena = leer.nextLine();
            
            if(cadena.equals("&&&&&")) {
                break;
            } else if (cadena.length() < 5 || !cadena.substring(0, 1).equals("X") || !cadena.substring(cadena.length()-1).equals("O")) {
                incorrectas++;
            } else {
                correctas++;
            }
        }
        
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }
    
}
