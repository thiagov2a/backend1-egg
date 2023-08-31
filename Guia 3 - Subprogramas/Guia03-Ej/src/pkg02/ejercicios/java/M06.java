/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ejercicios.java;

import java.util.Scanner;

/**
 * Implementar un programa que le pida dos números enteros al usuario y
 * determine si ambos o alguno de ellos es mayor a 25.
 *
 * @author Thiago
 */
public class M06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar 2 números:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        if (num1 > 25 || num2 > 25) {

            System.out.println("Al menos uno de los números es mayor a 25");
        } else {

            System.out.println("Ninguno de los números es mayor a 25");
        }
    }

}
