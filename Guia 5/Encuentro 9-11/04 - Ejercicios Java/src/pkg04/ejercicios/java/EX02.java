/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.ejercicios.java;

import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 *
 * @author Thiago
 */
public class EX02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingresar tamaño de vector: ");
        int tamaño = input.nextInt();
    }

    public static void llenarVector(Scanner input, int tamaño) {

        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingresar valor entero para vector[" + i + "]: ");
            vector[i] = input.nextInt();
        }

    }

}
