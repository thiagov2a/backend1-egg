/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Service.ArregloService;

/**
 *
 * @author Thiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArregloService as = new ArregloService();
        double[] A = new double[50];
        double[] B = new double[20];
        
        as.inicializarA(A);
        
        System.out.println("Vector A.");
        as.mostrar(A);
        System.out.println("");
        
        as.ordenar(A);
        
        System.out.println("Vector A de Mayor a Menor.");
        as.mostrar(A);
        System.out.println("");
        
        as.inicializarB(A, B);
        
        System.out.println("Vector B.");
        as.mostrar(B);
    }
    
}
