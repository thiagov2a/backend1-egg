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
public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int pag;

    public Libro() {
        
    }

    public Libro(String isbn, String titulo, String autor, int pag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
    }
    
    public void mostrarLibro() {
        System.out.println("Datos del Libro.\nISBN: " + isbn + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nPáginas: " + pag);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", pag=" + pag + '}';
    }

}
