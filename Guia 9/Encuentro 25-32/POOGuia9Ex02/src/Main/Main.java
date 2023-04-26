/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Ahorcado;
import Service.AhorcadoService;

/**
 *
 * @author Thiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AhorcadoService service = new AhorcadoService();
        
        Ahorcado a1 = service.crearJuego();
        
        service.juego(a1);
    }
    
}
