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
public class E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;

        System.out.println("Ingrese dos números enteros positivos:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        do {
            System.out.println("MENÚ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        System.out.println("El resultado es: " + ((double)num1 / num2));
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    String confirmacion = leer.next();
                    if (confirmacion.equalsIgnoreCase("S")) {
                        System.out.println("SALIENDO...");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (true);
    }
    
}
