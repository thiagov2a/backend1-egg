/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.ejercicios.java;

import java.util.Scanner;

/**
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
