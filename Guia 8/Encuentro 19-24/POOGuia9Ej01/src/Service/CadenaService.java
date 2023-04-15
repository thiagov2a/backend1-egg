/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cadena;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class CadenaService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearFrase() {
        
        limpiarPantalla();
        
        System.out.println("CREAR CADENA");
        
        System.out.print("Ingresar frase: ");
        String frase = input.nextLine();
        
        esperarTecla();

        return new Cadena(frase);
    }

    public void mostrarVocales(Cadena c) {

        int cont = 0;
        String vocales = "AEIOUaeiou";
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            if (vocales.contains(letra)) {
                cont++;
            }
        }
        System.out.println("Vocales contabilizadas: " + cont);
        esperarTecla();
    }

    public void invertirFrase(Cadena c) {

        String fraseInvertida = "";
        for (int i = c.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += c.getFrase().substring(i, i + 1);
        }
        System.out.println("Frase normal: " + c.getFrase());
        System.out.println("Frase invertida: " + fraseInvertida);
        esperarTecla();
    }

    public void vecesRepetido(Cadena c, String letraUsuario) {

        letraUsuario = letraUsuario.toUpperCase();
        String frase = c.getFrase().toUpperCase();
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (frase.substring(i, i + 1).contains(letraUsuario)) {
                cont++;
            }
        }
        System.out.println("El caracter '" + letraUsuario + "' se repite " + cont + " veces.");
        esperarTecla();
    }

    public void compararLongitud(Cadena c, String fraseUsuario) {

        if (c.getLongitud() == fraseUsuario.length()) {
            System.out.println("Las frases tienen la misma longitud.");
        } else {
            System.out.println("Las frases no tienen la misma longitud.");
        }
        esperarTecla();
    }

    public void unirFrases(Cadena c, String fraseUsuario) {

        String frase = c.getFrase();
        frase += fraseUsuario;
        System.out.println("Frases unificadas: " + frase);
        esperarTecla();
    }

    public void reemplazar(Cadena c, String letraUsuario) {

        //String fraseReemplazada = f.getFrase().replace("A", letraUsuario).replace("a", letraUsuario);
        String fraseReemplazada = "";
        String vocales = "Aa";
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            if (vocales.contains(letra)) {
                fraseReemplazada += letraUsuario;
            } else {
                fraseReemplazada += letra;
            }
        }
        System.out.println(fraseReemplazada);
        esperarTecla();
    }
    
    public boolean contiene(Cadena c, String letraUsuario) {
        
        boolean contiene = false;
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            if (letraUsuario.contains(letra)) {
                contiene = true;
                break;
            }
        }
        return contiene;
    }
    
    public void mostrarMenu(Cadena c) {
        
        String fraseUsuario = "";
        String letraUsuario = "";
        String salir = "";
        int opc;

        do {
            System.out.print("\nMENÚ\n"
                    + "1. Mostrar vocales.\n"
                    + "2. Invertir frase.\n"
                    + "3. Veces repetido.\n"
                    + "4. Comparar longitud.\n"
                    + "5. Unir frases.\n"
                    + "6. Reemplazar.\n"
                    + "7. Contiene.\n"
                    + "8. Salir.\n"
                    + "> ");
            opc = input.nextInt();
            limpiarPantalla();

            switch (opc) {
                case 1:
                    mostrarVocales(c);
                    break;
                case 2:
                    invertirFrase(c);
                    break;
                case 3:
                    System.out.print("Ingresar letra.\n> ");
                    letraUsuario = input.next();
                    vecesRepetido(c, letraUsuario);
                    break;
                case 4:
                    System.out.print("Ingresar frase.\n> ");
                    fraseUsuario = input.next();
                    compararLongitud(c, fraseUsuario);
                    break;
                case 5:
                    System.out.print("Ingresar frase.\n> ");
                    fraseUsuario = input.next();
                    unirFrases(c, fraseUsuario);
                    break;
                case 6:
                    System.out.print("Ingresar letra.\n> ");
                    letraUsuario = input.next();
                    reemplazar(c, letraUsuario);
                    break;
                case 7:
                    System.out.print("Ingresar letra.\n> ");
                    letraUsuario = input.next();
                    System.out.println("¿Contiene la letra '" + letraUsuario + "'?" + contiene(c, letraUsuario));
                    esperarTecla();
                    break;
                case 8:
                    do {
                        System.out.print("¿Esta seguro que desea salir? S/N\n> ");
                        salir = input.next();
                        if (salir.equalsIgnoreCase("S")) {
                            limpiarPantalla();
                            System.out.println("¡Hasta pronto!");
                            break;
                        } else if (salir.equalsIgnoreCase("N")) {
                            limpiarPantalla();
                            System.out.println("Volver al menú.");
                            esperarTecla();
                            break;
                        } else {
                            System.out.print("Opción no disponible. Intente nuevamente.\n> ");
                        }
                    } while (true);
                    break;
                default:
                    System.out.print("Opción no disponible. Intente nuevamente.\n> ");
                    break;
            }
        } while (!salir.equalsIgnoreCase("S"));
    }
    
    public void esperarTecla() {

        boolean esperandoEnter = true;

        System.out.print("\nPresione Enter para continuar.\n> ");

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
