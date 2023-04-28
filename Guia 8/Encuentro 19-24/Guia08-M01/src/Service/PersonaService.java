/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class PersonaService {

    private Scanner input = new Scanner(System.in);

    public Persona crearPersona() {
        Persona ps = new Persona();

        System.out.print("Ingresar nombre de la persona: ");
        ps.setNombre(input.next());

        return ps;
    }

    public void mostrarPersona(Persona ps) {

        System.out.println("El nombre de la persona ingresada es: " + ps.getNombre());
    }
}
