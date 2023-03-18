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
public class M08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int nota = -1;

        while (nota < 0 || nota > 10) {
            System.out.print("Ingrese una nota (entre 0 y 10): ");
            nota = leer.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("La nota no es válida.");
            }
        }

        System.out.println("La nota ingresada es: " + nota);
    }
    
}
