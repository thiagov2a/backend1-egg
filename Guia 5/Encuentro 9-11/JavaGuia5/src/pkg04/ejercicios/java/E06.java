/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.ejercicios.java;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 * @author Thiago
 */
public class E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        llenarMatriz(matriz);
        sumarMatriz(matriz);
    }

    public static void llenarMatriz(int[][] matriz) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Introducir valor entre 1 y 9 para matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextInt();

                while (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.print("Se debe de ingresar un valor entre 1 y 9.\nIntroducir valor nuevamente: ");
                    matriz[i][j] = leer.nextInt();
                }
            }
        }
    }

    public static void sumarMatriz(int[][] matriz) {

        int filas = 0;
        int colum = 0;

        for (int i = 0; i < 3; i++) {

            filas = 0;
            colum = 0;

            for (int j = 0; j < 3; j++) {
                filas += matriz[i][j];
                colum += matriz[j][i];
            }

            if (filas != 15 || colum != 15) {
                mostrarMatriz(matriz);
                System.out.println("La matriz no es mágica.");
                return; //El return se usa como un System.exit(0). Tambien podemos aplicar un boolean.
            }
        }

        int diag1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int diag2 = matriz[0][2] + matriz[1][1] + matriz[2][0];

        if (diag1 != 15 || diag2 != 15) {
            mostrarMatriz(matriz);
            System.out.println("La matriz no es mágica.");
            return;
        }

        mostrarMatriz(matriz);
        System.out.println("La matriz es mágica.");
        System.out.println("Sumas: " + diag1 + ", " + diag2 + ", " + filas + ", " + colum + ".");
    }

    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
