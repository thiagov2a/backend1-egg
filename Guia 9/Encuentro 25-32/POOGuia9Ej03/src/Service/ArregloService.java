/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Arrays;

/**
 *
 * @author Thiago
 */
public class ArregloService {

    public void inicializarA(double[] vectorA) {

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) (Math.random() * 100);
        }
    }

    public void mostrar(double[] vector) {

        System.out.println(Arrays.toString(vector));
    }

    public void ordenar(double[] vector) {

        double[] temp = new double[vector.length];

        Arrays.sort(vector);

        for (int i = 0; i < vector.length; i++) {

            temp[(vector.length - 1) - i] = vector[i];
        }

        for (int i = 0; i < vector.length; i++) {
            vector[i] = temp[i];
        }
    }

    public void inicializarB(double[] vectorA, double[] vectorB) {

        double numA;

        Arrays.fill(vectorB, 0.5);

        for (int i = 0; i < 10; i++) {

            numA = vectorA[i];
            Arrays.fill(vectorB, i, i + 1, numA);
        }
    }

}
