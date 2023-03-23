/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.ejercicios.java;

import java.util.Random;
import java.util.Scanner;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 *
 * @author Thiago
 */
public class EX03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tamaño = input.nextInt();
        int[] vector = llenarVector(tamaño);

    }

    public static int[] llenarVector(int tamaño) {

        int[] vector = new int[tamaño];
        Random rand = new Random();

        for (int i = 0; i < tamaño; i++) {
            vector[i] = rand.nextInt(100);
        }

        return vector;
    }

}
