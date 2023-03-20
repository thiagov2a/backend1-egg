/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.ejercicios.java;

/**
 *
 * @author Thiago
 */
public class E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] num = new int[100];

        llenarVector(num);
        mostrarVector(num);
    }

    public static void llenarVector(int num[]) {

        for (int i = 0; i < 100; i++) {
            num[i] = i + 1;
        }

    }

    public static void mostrarVector(int num[]) {

        for (int i = 99; i >= 0; i--) {
            System.out.println("[" + num[i] + "]");
        }

    }

}
