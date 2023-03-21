/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.ejercicios.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[] cont = new int[5];

        System.out.print("Ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();
        int[] vector = llenarVector(tamaño);

        for (int i = 0; i < tamaño; i++) {
            int dig = String.valueOf(vector[i]).length();
            cont[dig - 1]++;
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(cont[i]);
        }
    }

    public static int[] llenarVector(int tamaño) {
        int[] vector = new int[tamaño];
        Random rand = new Random();

        for (int i = 0; i < tamaño; i++) {
            vector[i] = rand.nextInt(10000);
        }

        return vector;
    }

}
