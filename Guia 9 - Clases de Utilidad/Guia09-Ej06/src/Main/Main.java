/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Curso;
import Service.CursoService;

/**
 *
 * @author Thiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CursoService service = new CursoService();
        
        Curso c1 = service.crearCurso();
        
        System.out.println(service.calcularGananciaSemanal(c1));
    }
    
}
