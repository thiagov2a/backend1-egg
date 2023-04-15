/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ejercicios.java;

import java.io.Console;
import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 *
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta.
 *
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de
 * lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá
 * investigar cómo se utilizan las siguientes funciones de Java Substring(),
 * Length(), equals().
 *
 * @author Thiago
 */
public class E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Console console = System.console();
        int correctas = 0;
        int incorrectas = 0;
        String cadena;

        while (true) {
            
            System.out.print("Ingrese una cadena (&&&&& para salir): ");
            cadena = leer.nextLine().toUpperCase();
            
            if (console != null) {
                console.writer().print("\033[H\033[2J");
                console.flush();
            }

            if (cadena.equals("&&&&&")) {
                break;
            } else if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(cadena.length() - 1) == 'O') {
                correctas++;
            } else {
                incorrectas++;
            }
        }

        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }

}
