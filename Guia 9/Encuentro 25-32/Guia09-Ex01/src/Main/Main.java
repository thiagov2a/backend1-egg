/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

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

        Scanner input = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[(int) (Math.random() * 12)];

        System.out.print("Adivine el mes secreto.\nIntroduzca el nombre del mes en minúsculas: ");
        String user;
        do {
            user = input.next();
            if (user.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.print("No ha acertado.\nIntente adivinarlo introduciendo otro mes: ");
            }
        } while (!user.equals(mesSecreto));
    }

}
