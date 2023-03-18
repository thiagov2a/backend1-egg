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
public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar cantidad de minutos: ");
        int min = leer.nextInt();
        
        int dias = min / 1440;
        int horas = min / 60;
        min = min % 60;
        
        System.out.println("Días: " + dias + "\nHoras: " + horas + "\nMinutos: " + min);
    }
    
}
