/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.ejercicios.java;

import java.util.Random;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * @author Thiago
 */
public class E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];

        llenarMatriz(matrizA, matrizB);
        mostrarMatriz(matrizA, matrizB);
    }

    public static void llenarMatriz(int[][] mA, int[][] mB) {

        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mA[i][j] = rand.nextInt(10);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mB[j][i] = mA[i][j];
            }
        }

    }

    public static void mostrarMatriz(int[][] mA, int[][] mB) {

        System.out.println("Matriz A:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + mA[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Matriz B:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + mB[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
