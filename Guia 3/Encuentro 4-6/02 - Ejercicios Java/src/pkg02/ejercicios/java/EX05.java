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
public class EX05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la clase de socio (A, B o C): ");
        String tipoSocio = sc.nextLine();
        
        System.out.print("Ingrese el costo del tratamiento: ");
        double costoTratamiento = sc.nextDouble();
        
        double importeAPagar;
        
        switch (tipoSocio) {
            case "A":
                importeAPagar = costoTratamiento * 0.5;
                break;
            case "B":
                importeAPagar = costoTratamiento * 0.65;
                break;
            case "C":
                importeAPagar = costoTratamiento;
                break;
            default:
                System.out.println("El tipo de socio ingresado no es válido.");
                return;
        }
        
        System.out.println("El importe a pagar es: $" + importeAPagar);
        
        sc.close();
    }
    
}
