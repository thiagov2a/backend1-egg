/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.ejercicios.java;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class M12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar dos valores: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
    }
    
    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El numero " + num1 + " es múltiplo de " + num2);
        } else {
            System.out.println("El numero " + num1 + " no es múltiplo de " + num2);
        }
    }
    
    /*
    public static void EsMultiplo(int num1, int num2) {
        boolean EsPar = (num1 % num2) == 0;
        System.out.println("¿El número " + num1 + " es múltiplo de " + num2 + "? " + EsPar);
    }
    */
    
}
