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
public class E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        boolean llave = false;
        
        System.out.print("Ingresar valor para generar un vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        System.out.print("Ingresar valor a buscar en el vector: ");
        int rpta = leer.nextInt();

        llenarVector(rand, vector);
        buscarVector(vector, rpta, llave);
    }

    public static void llenarVector(Random rand, int vector[]) {

        for (int i = 0; i < 100; i++) {
            vector[i] = rand.nextInt(100);
        }

    }

    public static void buscarVector(int vector[], int rpta, boolean llave) {

        for (int i = 1; i < 100; i++) {
            if (vector[i] == rpta) {
                if (!llave) {
                    System.out.println("El número " + rpta + " se encuentra en la posición:");
                    llave = true;
                }
                System.out.println("[" + i + "]");
            }
        }

        if (!llave) {
            System.out.println("El número " + rpta + " no se encuentra en el vector.");
        }
    }
    
}
