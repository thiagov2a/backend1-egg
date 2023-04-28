/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Persona;
import Service.PersonaService;
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
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        PersonaService personaService = new PersonaService();
        
        Persona p1 = personaService.crearPersona();
        System.out.println("");
        
        personaService.calcularEdad(p1);
        System.out.println("");
        
        System.out.print("Ingresar edad para comparar: ");
        int edad = input.nextInt();
        
        if (personaService.menorQue(p1, edad)) {
            System.out.println("La persona es menor que " + edad + ".");
        } else {
            System.out.println("La persona es mayor a " + edad + ".");
        }
        System.out.println("");
        
        personaService.mostrarPersona(p1);
    }
    
}
