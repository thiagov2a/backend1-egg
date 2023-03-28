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
public class Persona {

    private String nombre;
    private String apellido;
    private String nacimiento;
    private String sexo;
    private int dni;

    public Persona() {

    }

    public Persona(String nombre, String apellido, String nacimiento, String sexo, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.dni = dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + ", sexo=" + sexo + ", dni=" + dni + '}';
    }

}
