/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ejercicios.java;

import java.util.Scanner;

/**
 * Una obra social tiene tres clases de socios:
 *
 * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento
 * en todos los tipos de tratamientos.
 *
 * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
 * para los mismos tratamientos que los socios del tipo A. Los socios que menos
 * aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
 *
 * Solicite una letra (carácter) que representa la clase de un socio, y luego un
 * valor real que represente el costo del tratamiento (previo al descuento) y
 * determine el importe en efectivo a pagar por dicho socio.
 *
 * @author Thiago
 */
public class EX05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la clase de socio (A, B o C): ");
        String tipoSocio = leer.nextLine();

        System.out.print("Ingrese el costo del tratamiento: ");
        double costoTratamiento = leer.nextDouble();

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
    }

}
