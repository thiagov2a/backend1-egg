/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.ejercicios.java;

import java.util.Scanner;

/**
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
 * de equipo y define su tipo de dato de tal manera que te permita alojar sus
 * nombres más adelante.
 *
 * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
 * compañeros de equipo
 *
 * @author Thiago
 */
public class M13_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] equipo = new String[10];

        llenarVector(equipo);
        mostrarVector(equipo);
    }

    public static void llenarVector(String equipo[]) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresar nombre N°" + (i + 1) + ": ");
            equipo[i] = leer.nextLine();
        }
    }

    public static void mostrarVector(String equipo[]) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre N°" + (i + 1) + ": " + equipo[i]);
        }
    }

}
