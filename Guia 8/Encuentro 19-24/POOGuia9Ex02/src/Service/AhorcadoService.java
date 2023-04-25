/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Ahorcado;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class AhorcadoService {

    Scanner input = new Scanner(System.in);

    public Ahorcado crearJuego() {

        Ahorcado ahorcado = new Ahorcado();

        limpiarPantalla();

        System.out.print("Ingresar una palabra para jugar.\n> ");
        String palabra = input.next();

        String[] vector = new String[palabra.length()];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        ahorcado.setPalabraBuscar(vector);

        System.out.print("Ingresar cantidad de jugadas máximas.\n> ");
        int num;
        do {
            while (!input.hasNextInt()) {
                System.out.print("Por favor, ingrese un número entero positivo.\n> ");
                input.next();
            }
            num = input.nextInt();
            ahorcado.setCantidadJugadasMaximas(num);
        } while (num <= 0);

        return ahorcado;
    }

    public void longitud(Ahorcado ahorcado) {
        System.out.println("Longitud de la palabra: " + ahorcado.getPalabraBuscar().length);
    }

    public void buscar(Ahorcado ahorcado, String letra) {

        boolean Esta = false;
        for (int i = 0; i < ahorcado.getPalabraBuscar().length; i++) {
            if (ahorcado.getPalabraBuscar()[i].equals(letra)) {
                Esta = true;
                break;
            }
        }
        if (Esta) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            int intentos = ahorcado.getCantidadJugadasMaximas();
            ahorcado.setCantidadJugadasMaximas(intentos - 1);
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }
    }

    public boolean encontradas(Ahorcado ahorcado, String letra) {

        int cont = 0;
        for (int i = 0; i < ahorcado.getPalabraBuscar().length; i++) {
            if (ahorcado.getPalabraBuscar()[i].equals(letra)) {
                cont++;
            }
        }
        int encontradas = ahorcado.getCantidadLetrasEncontradas();
        ahorcado.setCantidadLetrasEncontradas(encontradas + cont);
        System.out.println("Número de letras (encontradas, faltantes): (" + ahorcado.getCantidadLetrasEncontradas() + "," + ahorcado.getPalabraBuscar().length + ")");
        return cont != 0;
    }

    public void intentos(Ahorcado ahorcado) {
        if (ahorcado.getCantidadJugadasMaximas() != 0) {
            System.out.println("Número de oportunidades restantes: " + ahorcado.getCantidadJugadasMaximas());
        } else {
            System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
        }
    }

    public void juego(Ahorcado ahorcado) {

        String letra;
        do {
            limpiarPantalla();

            System.out.print("Ingrese una letra:\n> ");
            letra = input.next();

            longitud(ahorcado);
            buscar(ahorcado, letra);
            encontradas(ahorcado, letra);
            intentos(ahorcado);

            esperarTecla();

        } while (ahorcado.getCantidadJugadasMaximas() != 0 && ahorcado.getPalabraBuscar().length > ahorcado.getCantidadLetrasEncontradas());
    }

    public void esperarTecla() {

        boolean esperandoEnter = true;

        System.out.print("\nPresione Enter para continuar.\n");

        while (esperandoEnter) {
            try {
                // Leer el siguiente byte del flujo de entrada del sistema
                int entrada = System.in.read();
                // Comprobar si el byte leído es igual al código ASCII de Enter
                if (entrada == '\n') {
                    limpiarPantalla();
                    esperandoEnter = false; // Salir del bucle
                }
            } catch (IOException e) {
            }
        }
    }

    public void limpiarPantalla() {

        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }

}
