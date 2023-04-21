/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class CursoService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Curso crearCurso() {
        
        Curso c = new Curso();
        
        System.out.println("Ingresar datos del curso.");
        
        System.out.print("Nombre del curso: ");
        c.setNombreCurso(input.nextLine());
        
        System.out.print("Cantidad horas por dia: ");
        c.setCantidadHorasPorDia(input.nextDouble());
        
        System.out.print("Cantidad de días por semana: ");
        c.setCantidadDiasPorSemana(input.nextInt());
        
        System.out.print("Ingresar turno(T/M): ");
        c.setTurno(input.next());
        
        System.out.print("Precio por hora: ");
        c.setPrecioPorHora(input.nextDouble());
        
        c.setAlumnos(cargarAlumnos());
        
        return c;
    }
    
    public String[] cargarAlumnos() {
        
        String[] a = new String[5];
        
        input.nextLine();
        
        System.out.println("Ingreso de alumnos.");
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nombre de alumno " + (i + 1) + ": ");
            a[i] = input.nextLine();
        }
        
        return a;
    } 
    
    public double calcularGananciaSemanal(Curso c) {
        
        double cantHoras = c.getCantidadHorasPorDia();
        double precioHora = c.getPrecioPorHora();
        int cantAlumnos = c.getAlumnos().length;
        int cantDiasSemana = c.getCantidadDiasPorSemana();
        
        return (cantHoras * precioHora * cantAlumnos * cantDiasSemana);
    }
    
}
