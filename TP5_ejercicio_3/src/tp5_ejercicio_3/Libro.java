/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_3;

/**
 *
 * @author jimen
 */
public class Libro {
    //  Creamos lso Atributos propios
    private String titulo;
    private String isbn;

    // Relación de Asociación Unidireccional: Libro -> Autor
    private Autor autor; 

    // Relación de Agregación: Libro -> Editorial
    private Editorial editorial; 

    // Creamos los constructor para inicializar un Libro con sus relaciones.
    
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor; // Relación con Autor
        this.editorial = editorial; // Relación con Editorial
    }

    // --- Getters y Setters (incluyendo los de las relaciones) ---

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter y Setter para la relación con Autor
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Getter y Setter para la relación con Editorial
    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    // Método Override para mostrar la información completa del Libro
    @Override
    public String toString() {
        return "Libro:\n" +
               "  - Título: " + titulo + "\n" +
               "  - ISBN: " + isbn + "\n" +
               "  - **" + autor.toString() + "**\n" + 
               "  - **" + editorial.toString() + "**";
    }
}
