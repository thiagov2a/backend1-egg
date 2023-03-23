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
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int n = sc.nextInt();

        int personasDebajoDe160 = 0;
        double sumaDeEstaturas = 0;
        double sumaDeEstaturasDebajoDe160 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la estatura de la persona #" + i + " en metros: ");
            double estatura = sc.nextDouble();
            sumaDeEstaturas += estatura;

            if (estatura < 1.60) {
                personasDebajoDe160++;
                sumaDeEstaturasDebajoDe160 += estatura;
            }
        }

        double promedioDeEstaturas = sumaDeEstaturas / n;
        double promedioDeEstaturasDebajoDe160 = sumaDeEstaturasDebajoDe160 / personasDebajoDe160;

        System.out.println("Promedio de estaturas en general: " + promedioDeEstaturas + " mts.");
        System.out.println("Promedio de estaturas por debajo de 1.60 mts.: " + promedioDeEstaturasDebajoDe160 + " mts.");

        sc.close();
    }

}
