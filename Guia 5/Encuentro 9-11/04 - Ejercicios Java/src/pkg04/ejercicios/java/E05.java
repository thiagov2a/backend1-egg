/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.ejercicios.java;

/**
 * Realice un programa que compruebe si una matriz dada es antisimétrica. Se
 * dice que una matriz A es antisimétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa).
 *
 * @author Thiago
 */
public class E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = {{0, 2, -4}, {-2, 0, -2}, {4, 2, 0}};

        if (esAntisimetrica(matriz)) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }

    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static boolean esAntisimetrica(int[][] matriz) {

        int[][] traspuesta = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                traspuesta[i][j] = -matriz[j][i];
            }
        }
        
        System.out.println("Matriz A:");
        mostrarMatriz(matriz);
        System.out.println("Matriz AT:");
        mostrarMatriz(traspuesta);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != traspuesta[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

}
