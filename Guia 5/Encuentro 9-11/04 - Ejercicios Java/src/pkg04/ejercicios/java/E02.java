/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.ejercicios.java;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido.
 *
 * @author Thiago
 */
public class E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();
        int[] vector = llenarVector(tamaño);

        System.out.print("Ingrese el número a buscar en el vector: ");
        int num = leer.nextInt();

        buscarNumero(vector, num);
    }

    public static int[] llenarVector(int tamaño) {
        int[] vector = new int[tamaño];
        Random rand = new Random();

        for (int i = 0; i < tamaño; i++) {
            vector[i] = rand.nextInt(100);
        }

        return vector;
    }

    public static void buscarNumero(int[] vector, int num) {

        boolean encontrado = false;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                if (!encontrado) {
                    System.out.println("El número " + num + " se encuentra en la posición:");
                    encontrado = true;
                }
                System.out.println("[" + i + "]");
            }
        }

        if (!encontrado) {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        }
    }

}
