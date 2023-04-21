/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class DateService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaActual() {
        return new Date();
    }

    public Date fechaNacimiento() {

        System.out.print("Ingrese su fecha de nacimiento.\nAño: ");
        int anio = input.nextInt();

        System.out.print("Mes: ");
        int mes = input.nextInt();

        System.out.print("Día: ");
        int dia = input.nextInt();

        return new Date(anio - 1900, mes - 1, dia);
    }

    public int diferencia(Date actual, Date nacimiento) {

        int anios;
        if (actual.getMonth() >= nacimiento.getMonth() && actual.getDay() >= nacimiento.getDay()) {
            anios = actual.getYear() - nacimiento.getYear();
        } else {
            anios = (actual.getYear() - nacimiento.getYear()) - 1;
        }
        return anios;
    }

}
