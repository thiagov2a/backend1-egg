/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cafetera;

/**
 *
 * @author Thiago
 */
public class CafeteraService {
    
    public void llenarCafetera(Cafetera c) {
        c.setCantidadActual(c.getCapacidadMaxima());
        System.out.println("Se llenó la cafetera.");
        System.out.println(c.getCantidadActual());
    }
    
    public void servirTaza(Cafetera c, int taza) {
        
        
    }
    
    public void vaciarCafetera(Cafetera c) {
        c.setCantidadActual(0);
        System.out.println("Se vació la cafetera.");
    }
}
