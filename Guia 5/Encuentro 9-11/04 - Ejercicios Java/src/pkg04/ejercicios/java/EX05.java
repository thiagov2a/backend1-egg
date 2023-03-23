/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.ejercicios.java;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un programa que llene una matriz de tamaño NxM con valores
 * aleatorios y muestre la suma de sus elementos.
 *
 * @author Thiago
 */
public class EX05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int suma = 0;

        System.out.print("Ingrese número de filas(n): ");
        int m = input.nextInt();
        System.out.print("Ingrese número de columnas(m): ");
        int n = input.nextInt();
        int[][] matriz = llenarMatriz(n, m);

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(" [" + matriz[i][j] + "]");
                suma += matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("La suma de todos los números es: " + suma);
    }

    public static int[][] llenarMatriz(int n, int m) {

        int[][] matriz = new int[m][n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                matriz[i][j] = rand.nextInt(10);
            }
        }
        return matriz;
    }
}
