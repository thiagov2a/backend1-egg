/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.ParDeNumeros;
import Service.ParDeNumerosService;

/**
 *
 * @author Thiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ParDeNumerosService parService = new ParDeNumerosService();
        ParDeNumeros par = new ParDeNumeros();
        
        parService.mostrarValores(par);
        System.out.println("El número mayor es: " + parService.devolverMayor(par));
        System.out.println("La potencia del mayor elevado almenos es: " + parService.calcularPotencia(par));
        System.out.println("La raíz cuadrada del menor es: " + parService.calculaRaiz(par));
    }
    
}
