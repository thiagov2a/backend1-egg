/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Cadena;
import Service.CadenaService;

/**
 *
 * @author Thiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CadenaService cs = new CadenaService();
        
        Cadena c1 = cs.crearFrase();
        
        cs.mostrarMenu(c1);
    }

    
}
