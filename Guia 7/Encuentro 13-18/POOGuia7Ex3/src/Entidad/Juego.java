/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de números. El primer jugador elige un
 * número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
 * número limitado de intentos y recibe una pista de "más alto" o "más bajo"
 * después de cada intento. El juego termina cuando el segundo jugador adivina
 * el número o se queda sin intentos. Registra el número de intentos necesarios
 * para adivinar el número y el número de veces que cada jugador ha ganado.
 *
 * @author Thiago
 */
public class Juego {

    private int jugador1;
    private int jugador2;
    private int intentos;

    public Juego() {
        jugador1 = 0;
        jugador2 = 0;
        intentos = 0;
    }

    public void iniciarJuego() {

        Scanner input = new Scanner(System.in);
        int numAdivinar;
        int acierto = 0;

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                System.out.print("Jugador 1 empieza.\nIngresar número a adivinar para Jugador 2: ");
                numAdivinar = input.nextInt();
                limpiarPantalla();
                System.out.println("Jugador 2 empieza.\n¡Adivina el número!");
            } else {
                System.out.print("Jugador 2 empieza.\nIngresar número a adivinar para Jugador 1: ");
                numAdivinar = input.nextInt();
                limpiarPantalla();
                System.out.println("Jugador 1 empieza.\n¡Adivina el número!");
            }

            intentos = 0;

            while (intentos < 5) {

                System.out.print("Intento #" + (intentos + 1) + ": ");
                acierto = input.nextInt();

                if (acierto > numAdivinar) {
                    System.out.println("Ingresar número menor.");
                } else if (acierto < numAdivinar) {
                    System.out.println("Ingresar un número mayor.");
                } else {
                    limpiarPantalla();
                    if (i % 2 == 0) {
                        System.out.println("¡Acertaste en " + (intentos + 1) + " intentos!\nGana el jugador 2.");
                        jugador2++;
                    } else {
                        System.out.println("¡Acertaste en " + (intentos + 1) + " intentos!\nGana el jugador 1.");
                        jugador1++;
                    }
                    break;
                }
                intentos++;
            }

            if (intentos == 5 && acierto != numAdivinar) {
                if (i % 2 == 0) {
                    limpiarPantalla();
                    System.out.println("El jugador 2 no adivino el número '" + numAdivinar + "'.\nGana el jugador 1.");
                    jugador1++;
                } else {
                    limpiarPantalla();
                    System.out.println("El jugador 1 no adivino el número.\nGana el jugador 2.");
                    jugador2++;
                }
            }

            System.out.println("El jugador 1 ha ganado " + jugador1 + " veces.");
            System.out.println("El jugador 2 ha ganado " + jugador2 + " veces.");
            System.out.println("*-------------------------------*");
        }
    }

    public void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }

    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

}
