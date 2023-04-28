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
public class Circunferencia {

    private Double PI;
    private Double area;
    private Double radio;
    private Double perimetro;

    public Circunferencia() {
        this.PI = Math.PI;
    }

    public Circunferencia(Double radio) {
        this.PI = Math.PI;
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresar un Radio: ");
        this.radio = input.nextDouble();
        area();
        perimetro();
    }

    public void area() {
        this.area = (3.1416 * radio * radio);
    }

    public void perimetro() {
        this.perimetro = (2 * 3.1416 * radio);
    }

    public void mostrarDatos() {
        System.out.println("Área: " + area + "\nRadio: " + radio + "\nPerimetro: " + perimetro);
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "area=" + area + ", radio=" + radio + ", perimetro=" + perimetro + '}';
    }

}
