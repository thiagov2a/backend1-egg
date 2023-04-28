/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class PersonaService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    DateService dateService = new DateService();
    Date actual = dateService.fechaActual();
    
    public Persona crearPersona() {
        
        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();
        
        Date nacimiento = dateService.fechaNacimiento();
        
        return new Persona(nombre, nacimiento);
    }
    
    public void calcularEdad(Persona persona) {
        
        System.out.println("La edad del usuario es: " + dateService.diferencia(actual, persona.getNacimiento()));
    }
    
    public boolean menorQue(Persona persona, int edad) {

        int edadPersona = dateService.diferencia(actual, persona.getNacimiento());
        
        return edad > edadPersona;
    }
    
    public void mostrarPersona(Persona persona) {
        
        System.out.println(persona.toString());
    }
    
}
