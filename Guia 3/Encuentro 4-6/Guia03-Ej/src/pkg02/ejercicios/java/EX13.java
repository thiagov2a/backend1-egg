/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ejercicios.java;

import java.util.Scanner;

/**
 * Crear un programa que dibuje una escalera de números, donde cada línea de
 * números comience en uno y termine en el número de la línea. Solicitar la
 * altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el
 * número 3: 
 *  1 
 *  12 
 *  123
 *
 * @author Thiago
 */
public class EX13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingresar altura de escalera numérica: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

}
