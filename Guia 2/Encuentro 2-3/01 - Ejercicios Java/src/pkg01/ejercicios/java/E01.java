/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.ejercicios.java;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el primer número:");
        int num1 = leer.nextInt();
        
        System.out.println("Ingresar el segundo número:");
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
    }
    
}
