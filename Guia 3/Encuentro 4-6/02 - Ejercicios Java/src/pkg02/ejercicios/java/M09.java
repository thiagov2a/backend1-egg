/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ejercicios.java;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class M09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int cont = 0;

        do {
            System.out.print("Ingresar un número: ");
            int num = leer.nextInt();

            if (num == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            }

            if (num > 0) {
                suma += num;
            }

            cont++;
        } while (cont < 20);

        System.out.println("La suma de los números positivos ingresados es: " + suma);
    }
    
}
