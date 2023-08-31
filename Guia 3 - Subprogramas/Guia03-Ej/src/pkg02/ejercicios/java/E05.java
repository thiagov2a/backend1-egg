/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ejercicios.java;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 *
 * @author Thiago
 */
public class E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresar un límite positivo: ");
        int lim = leer.nextInt();
        int suma = 0;

        do {
            System.out.print("Ingresar un número: ");
            int num = leer.nextInt();
            suma += num;
        } while (suma <= lim);

        System.out.println("La suma de los números ingresados es " + suma + " y supera el límite de " + lim);
    }

}
