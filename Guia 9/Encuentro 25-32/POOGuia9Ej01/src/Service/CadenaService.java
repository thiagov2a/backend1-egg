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
        System.out.print("CREAR CADENA\nIngresar frase.\n> ");
        String frase = input.nextLine();
        esperarTecla();
        return new Cadena(frase);
    }

    public void mostrarVocales(Cadena c) {

        String vocales = "AEIOUaeiou";
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            if (vocales.contains(letra)) {
                cont++;
            }
        }
        System.out.println("La frase contiene " + cont + " vocales.");
        esperarTecla();
    }

    public void invertirFrase(Cadena c) {

        String fraseInvertida = "";
        for (int i = c.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += c.getFrase().substring(i, i + 1);
        }
        System.out.println("La frase invertida es: " + fraseInvertida + ".");
        esperarTecla();
    }

    public void vecesRepetido(Cadena c, String letraUsuario) {

        String frase = c.getFrase().toUpperCase();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).contains(letraUsuario)) {
                cont++;
            }
        }
        System.out.println("El carácter '" + letraUsuario + "' se repite " + cont + " veces.");
        esperarTecla();
    }

    public void compararLongitud(Cadena c, String fraseUsuario) {

        if (c.getLongitud() > fraseUsuario.length()) {
            System.out.println("La frase '" + c.getFrase() + "' es más larga que la frase '" + fraseUsuario + "'.");
        } else if (c.getLongitud() < fraseUsuario.length()) {
            System.out.println("La frase '" + c.getFrase() + "' es más corta que la frase '" + fraseUsuario + "'.");
        } else {
            System.out.println("La frase '" + c.getFrase() + "' tiene la misma longitud que la frase '" + fraseUsuario + "'.");
        }
        esperarTecla();
    }

    public void unirFrases(Cadena c, String fraseUsuario) {

        String frase = c.getFrase();
        frase += " " + fraseUsuario;
        System.out.println("La frase resultante es: " + frase + ".");
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
        System.out.println("La frase resultante es: " + fraseReemplazada + ".");
        esperarTecla();
    }

    public boolean contiene(Cadena c, String letraUsuario) {

        if (c.getFrase().contains(letraUsuario)) {
            System.out.println("La frase contiene la letra '" + letraUsuario + "'.");
            return true;
        } else {
            System.out.println("La frase no contiene la letra '" + letraUsuario + "'.");
            return false;
        }
    }

    public void mostrarMenu(Cadena c) {

        String fraseUsuario;
        String salir = "";
        int opc;

        do {
            
            System.out.print("\nMENÚ\n"
                    + "1. Ingresar una nueva frase.\n"
                    + "2. Mostrar vocales de la frase.\n"
                    + "3. Invertir la frase.\n"
                    + "4. Contar veces que se repite un carácter.\n"
                    + "5. Comparar longitud con otra frase.\n"
                    + "6. Unir con otra frase.\n"
                    + "7. Reemplazar carácteres.\n"
                    + "8. Comprobar si contiene una letra.\n"
                    + "9. Salir.\n"
                    + "> ");
            opc = input.nextInt();
            input.nextLine();
            limpiarPantalla();

            switch (opc) {
                case 1:
                    c = crearFrase();
                    break;
                case 2:
                    mostrarVocales(c);
                    break;
                case 3:
                    invertirFrase(c);
                    break;
                case 4:
                    System.out.print("Ingresar letra.\n> ");
                    fraseUsuario = input.next();
                    vecesRepetido(c, fraseUsuario.toUpperCase());
                    break;
                case 5:
                    System.out.print("Ingresar frase.\n> ");
                    fraseUsuario = input.next();
                    compararLongitud(c, fraseUsuario);
                    break;
                case 6:
                    System.out.print("Ingresar frase.\n> ");
                    fraseUsuario = input.next();
                    unirFrases(c, fraseUsuario);
                    break;
                case 7:
                    System.out.print("Ingresar letra.\n> ");
                    fraseUsuario = input.next();
                    reemplazar(c, fraseUsuario);
                    break;
                case 8:
                    System.out.print("Ingresar letra.\n> ");
                    fraseUsuario = input.next();
                    contiene(c, fraseUsuario);
                    break;
                case 9:
                    System.out.print("¿Está seguro que desea salir? S/N\n> ");
                    salir = input.next();
                    if (!salir.equalsIgnoreCase("S")) {
                        limpiarPantalla();
                        System.out.println("Volver al menú.");
                        esperarTecla();
                    }
                    break;
                default:
                    limpiarPantalla();
                    System.out.println("Opción no disponible. Intente nuevamente.");
                    esperarTecla();
                    break;
            }
            
        } while (!salir.equalsIgnoreCase("S"));

        limpiarPantalla();
        System.out.println("Gracias por usar el programa.");
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
