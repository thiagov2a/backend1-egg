/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Libro;
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
        
        Libro libro1 = new Libro();
        generarLibro(libro1);
        
        Libro libro2 = new Libro();
        generarLibro(libro2);
    }
    
    public static void generarLibro(Libro n) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresar ISBN: ");
        n.setIsbn(input.next());
        
        System.out.print("Ingresar Titulo: ");
        n.setTitulo(input.next());
        
        System.out.print("Ingresar Autor: ");
        n.setAutor(input.next());
        
        System.out.print("Ingresar N° de págs.: ");
        n.setPag(input.nextInt());
        
        n.mostrarLibro();
    }
}
