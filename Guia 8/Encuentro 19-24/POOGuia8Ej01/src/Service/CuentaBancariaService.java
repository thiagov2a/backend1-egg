/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.CuentaBancaria;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class CuentaBancariaService {

    private final Scanner input = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {

        limpiarPantalla();
        CuentaBancaria cbs = new CuentaBancaria();

        System.out.println("CREAR CUENTA");

        System.out.print("Ingresa número de cuenta: ");
        cbs.setNumeroCuenta(input.nextInt());

        System.out.print("Ingresar número de DNI: ");
        cbs.setDniCliente(input.nextLong());

        cbs.setSaldoActual(0);
        
        esperarTecla();

        return cbs;
    }

    public void ingresar(CuentaBancaria cb, double saldoIngresar) {

        limpiarPantalla();
        double saldoActual = cb.getSaldoActual();
        saldoActual += saldoIngresar;
        cb.setSaldoActual(saldoActual);
        System.out.println("Se ingresó: $" + saldoIngresar + "\nUsted cuenta con: $" + saldoActual);
        esperarTecla();
    }

    public void retirar(CuentaBancaria cb, double saldoRetirar) {

        limpiarPantalla();
        double saldoActual = cb.getSaldoActual();
        if (saldoActual >= saldoRetirar) {
            saldoActual -= saldoRetirar;
            cb.setSaldoActual(saldoActual);
            System.out.println("Se retiró: $" + saldoRetirar + "\nUsted cuenta con: $" + saldoActual);
            esperarTecla();
        } else if (saldoActual == 0) {
            System.out.println("Saldo insuficiente.\nUsted cuenta con: $" + saldoActual);
            esperarTecla();
        } else {
            System.out.println("Saldo insuficiente.\nUsted cuenta con: $" + saldoActual);
            System.out.print("¿Desea retirar el saldo actual? S/N\n> ");
            String opcion;
            do {
                opcion = input.next();
                if (opcion.equalsIgnoreCase("S")) {
                    saldoRetirar = saldoActual;
                    saldoActual -= saldoRetirar;
                    cb.setSaldoActual(saldoActual);
                    System.out.println("Se retiró: $" + saldoRetirar + "\nUsted cuenta con: $" + saldoActual);
                    esperarTecla();
                    break;
                } else if (opcion.equalsIgnoreCase("N")) {
                    System.out.println("Volver al menú.");
                    esperarTecla();
                    break;
                } else {
                    System.out.print("Opción no disponible. Intente nuevamente.\n> ");
                }
            } while (!opcion.equalsIgnoreCase("S") || !opcion.equalsIgnoreCase("N"));
        }
    }

    public void extraccionRapida(CuentaBancaria cb) {

        limpiarPantalla();
        double saldoActual = cb.getSaldoActual();
        double saldoRetirar = saldoActual * 0.2;
        if (saldoActual == 0) {
            System.out.println("Saldo insuficiente.\nUsted cuenta con: $" + saldoActual);
            esperarTecla();
        } else {
            saldoActual -= saldoRetirar;
            cb.setSaldoActual(saldoActual);
            System.out.println("Se retiró: $" + saldoRetirar + "\nUsted cuenta con: $" + saldoActual);
            esperarTecla();
        }
    }

    public void consultarSaldo(CuentaBancaria cb) {

        limpiarPantalla();
        double saldoActual = cb.getSaldoActual();
        System.out.println("SALDO\nUsted cuenta con: $" + saldoActual);
        esperarTecla();
    }

    public void consultarDatos(CuentaBancaria cb) {

        limpiarPantalla();
        int numeroCuenta = cb.getNumeroCuenta();
        long dniCliente = cb.getDniCliente();
        System.out.println("DATOS\nNúmero de cuenta: " + numeroCuenta + "\nNúmero de DNI: " + dniCliente);
        esperarTecla();
    }

    public void mostrarMenu(CuentaBancaria cb) {

        String salir = "";
        int opc;

        do {
            System.out.print("\nMENÚ\n"
                    + "1. Ingresar dinero.\n"
                    + "2. Retirar dinero.\n"
                    + "3. Extracción rápida.\n"
                    + "4. Consultar saldo.\n"
                    + "5. Consultar datos.\n"
                    + "6. Salir.\n"
                    + "> ");
            opc = input.nextInt();
            limpiarPantalla();

            switch (opc) {
                case 1:
                    System.out.print("Ingresar saldo a importar.\n> $");
                    double saldoIngresar = input.nextDouble();
                    ingresar(cb, saldoIngresar);
                    break;
                case 2:
                    System.out.print("Ingresar saldo a retirar.\n> $");
                    double saldoRetirar = input.nextDouble();
                    while (saldoRetirar <= 0) {
                        System.out.print("Saldo insuficiente. Intente nuevamente.\n> $");
                        saldoRetirar = input.nextDouble();
                    }
                    retirar(cb, saldoRetirar);
                    break;
                case 3:
                    extraccionRapida(cb);
                    break;
                case 4:
                    consultarSaldo(cb);
                    break;
                case 5:
                    consultarDatos(cb);
                    break;
                case 6:
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
