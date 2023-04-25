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
public class Ahorcado {
    
    private String[] palabraBuscar;
    private int cantidadLetrasEncontradas;
    private int cantidadJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscar, int cantidadLetrasEncontradas, int cantidadJugadasMaximas) {
        this.palabraBuscar = palabraBuscar;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    public String[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(String[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }
    
    
}
