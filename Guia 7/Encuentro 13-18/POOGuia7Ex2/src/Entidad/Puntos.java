/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Puntos {

    private int x1, x2, y1, y2;
    private double distP;

    public Puntos() {

    }

    public void crearPuntos() {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresar primer cordenada.");
        System.out.print("x1: ");
        x1 = input.nextInt();
        System.out.print("y1: ");
        y1 = input.nextInt();

        System.out.println("Ingresar segunda cordenada.");
        System.out.print("x2: ");
        x2 = input.nextInt();
        System.out.print("y2: ");
        y2 = input.nextInt();

        calcularDistancia();
    }

    public void calcularDistancia() {

        int distX = x2 > x1 ? x2 - x1 : x1 - x2;
        int distY = y2 > y1 ? y2 - y1 : y1 - y2;

        distP = Math.sqrt(distX * distX + distY * distY);
    }

    public void imprimirPuntos() {

        System.out.println("Punto 1:\nX: " + x1 + "\nY: " + y1);
        System.out.println("Punto 2:\nX: " + x2 + "\nY: " + y2);
        System.out.println("Distancia: " + String.format("%.2f", distP));
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public double getDistP() {
        return distP;
    }

    public void setDistP(double distP) {
        this.distP = distP;
    }

}
