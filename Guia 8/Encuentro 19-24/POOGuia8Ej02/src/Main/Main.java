/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Cafetera;
import Service.CafeteraService;

/**
 *
 * @author Thiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CafeteraService cafeServicio = new CafeteraService();
        Cafetera cafe1 = new Cafetera();
    }
    
//    public static void Menu() { PASAR A SERVICE
//        
//        Scanner input = new Scanner(System.in);
//        
//        cafeServicio.llenarCafetera(cafe1);
//        
//        System.out.println("");
//        int taza = input.nextInt();
//        cafeServicio.servirTaza(cafe1, taza);
//    }

}
