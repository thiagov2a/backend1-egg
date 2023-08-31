/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        
        r1.setBase(input.nextInt());
        r1.setAltura(input.nextInt());
        System.out.println(r1.calcularPerimetro());
        System.out.println(r1.calcularSuperficie());
        r1.imprimirRectangulo();
    } 
    
}
