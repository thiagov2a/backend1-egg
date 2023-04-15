/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ejercicios.java;

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 *
 * @author Thiago
 */
public class EX06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int n = leer.nextInt();

        int personas160 = 0;
        double sumaEstatura = 0;
        double sumaEstatura160 = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Ingrese la estatura de la persona #" + i + " en metros: ");
            double estatura = leer.nextDouble();

            sumaEstatura += estatura;

            if (estatura < 1.60) {
                sumaEstatura160 += estatura;
                personas160++;
            }
        }

        double promedioEstatura = sumaEstatura / n;

        System.out.println("Promedio de estaturas en general: " + String.format("%.2f", promedioEstatura) + " mts.");

        if (personas160 > 0) {
            double promedioEstatura160 = sumaEstatura160 / personas160;
            System.out.println("Promedio de estaturas por debajo de 1,60 mts.: " + String.format("%.2f", promedioEstatura160) + " mts.");
        } else {
            System.out.println("No se encontraron personas con estaturas por debajo de 1.60 mts.");
        }
    }

}
