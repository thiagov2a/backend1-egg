/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.ejercicios.java;

import java.util.Scanner;

/**
 * Escribir un programa que procese una secuencia de caracteres ingresada por
 * teclado y terminada en punto, y luego codifique la palabra o frase ingresada
 * de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
 * en la tabla y el resto de los caracteres (incluyendo a las vocales
 * acentuadas) se mantienen sin cambios. 
 * 
 * a e i o u
 * @ # $ % *
 *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la
 * codificación correspondiente. Utilice la estructura “según” para la
 * transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a
 * las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s
 * %nc# y 10.
 *
 * @author Thiago
 */
public class M11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase;

        do {
            System.out.print("Ingrese una frase o palabra terminada en punto: ");
            frase = leer.nextLine();
        } while (!frase.endsWith("."));

        String codificada = codificar(frase);

        System.out.println("Secuencia codificada: " + codificada);
    }

    public static String codificar(String frase) {

        String codificada = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            switch (c) {
                case 'a':
                    codificada += "@";
                    break;
                case 'b':
                    codificada += "@";
                    break;
                case 'c':
                    codificada += "@";
                    break;
                case 'd':
                    codificada += "@";
                    break;
                case 'e':
                    codificada += "@";
                    break;
                default:
                    codificada += Character.toString(c);
                    break;
            }
        }
        return codificada;
    }

}
