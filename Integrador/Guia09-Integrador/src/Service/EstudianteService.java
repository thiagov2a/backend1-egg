/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class EstudianteService {

    Scanner input = new Scanner(System.in);

    public Estudiante[] crearEstudiantes() {

        Estudiante[] estudiantes = new Estudiante[8];

        System.out.println("Ingrese los datos de los estudiantes.");
        for (int i = 0; i < estudiantes.length; i++) {

            Estudiante estudiante = new Estudiante();

            System.out.print("Estudiante " + (i + 1) + ".\nNombre: ");
            estudiante.setNombre(input.next());

            System.out.print("Nota: ");
            estudiante.setNota(input.nextInt());
            while (estudiante.getNota() < 1 || estudiante.getNota() > 10) {
                System.out.print("La nota debe de estar entre 1 y 10 (incluidos).\nNota: ");
                estudiante.setNota(input.nextInt());
            }
            System.out.println("");

            estudiantes[i] = estudiante;
        }
        return estudiantes;
    }

    public double promedio(Estudiante[] estudiantes) {

        double suma = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            suma += estudiantes[i].getNota();
        }
        double promedio = (suma / estudiantes.length);
        System.out.println("Promedio de notas: " + promedio);
        System.out.println("");

        return promedio;
    }

    public String[] mayorPromedio(Estudiante[] estudiantes) {

        double promedio = promedio(estudiantes);
        int mayorPromedio = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedio) {
                mayorPromedio++;
            }
        }

        String[] estudiantesMayorPromedio = new String[mayorPromedio];
        int j = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedio) {
                estudiantesMayorPromedio[j] = estudiantes[i].getNombre();
                j++;
            }
        }

        return estudiantesMayorPromedio;
    }

    public void mostrarMayorPromedio(Estudiante[] estudiantes) {

        String[] estudiantesMayorPromedio = mayorPromedio(estudiantes);

        System.out.println("Estudiantes con mayor promedio.");
        for (int i = 0; i < estudiantesMayorPromedio.length; i++) {
            System.out.println("Nombre: " + estudiantesMayorPromedio[i]);
        }
    }

}
