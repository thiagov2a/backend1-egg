/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class POOEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        Persona p1 = new Persona("Rita", "Gayoso", "23/5/2000", "F", 4336897);
        Persona p2 = new Persona("Emilio", "Cerletti", "10/8/1980", "M", 3068453);
        
        System.out.println(p1);
        System.out.println(p2);
    }
    
}
