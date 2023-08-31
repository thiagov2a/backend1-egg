/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ejercicios.java;

import java.util.Scanner;

/**
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
 * el número ingresado seguido de tantos asteriscos como indique su valor. Por
 * ejemplo: 
 * 5 ***** 
 * 3 *** 
 * 11 *********** 
 * 2 **
 *
 * @author Thiago
 */
public class M10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {

            System.out.print("Ingresar un número entre 1 y 20: ");
            int num = leer.nextInt();

            if (num < 1 || num > 20) {
                System.out.println("El numero ingresado no está entre 1 y 20");
                i--;
                continue;
            }

            System.out.print(num + " ");

            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
