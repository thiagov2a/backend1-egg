/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Thiago
 */
public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }
    
    public void crearRectangulo() {
        
    }
    
    public void imprimirRectangulo() {
        
        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == (altura - 1)) {
                for (int j = 0; j < base; j++) {
                    System.out.print(" * ");
                }
            } else {
                System.out.print(" * ");
                for (int j = 0; j < base - 2; j++) {
                    System.out.print("   ");
                }
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    
    public int calcularSuperficie() {
        return base * altura;
    }
    
    public int calcularPerimetro() {
        return (base + altura) * 2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
