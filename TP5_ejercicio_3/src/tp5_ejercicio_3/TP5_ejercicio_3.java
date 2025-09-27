/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ejercicio_3;

/**
 *
 * @author jimen
 */
public class TP5_ejercicio_3 {

    public static void main(String[] args) {
        
        // 1. Crear objetos independientes: Autor y Editorial
        Autor Daniel = new Autor("Daniel Jiemenz", "Argentina");
        Editorial sudamericana = new Editorial("Editorial Sudamericana", "Calle Ninguna 987, Cordoba");
        
        System.out.println("--- Objetos creados de forma independiente ---");
        System.out.println(Daniel);
        System.out.println(sudamericana);

        System.out.println("\n----------------------------------------------");
        
        // 2. Crear un objeto Libro, pasando los objetos Autor y Editorial como argumentos
        // Esto establece las relaciones de Asociación y Agregación.
        Libro ficciones = new Libro("Accion", "987-654321", Daniel, sudamericana);

        System.out.println("--- Objeto Libro creado con sus relaciones ---");
        System.out.println(ficciones);

        System.out.println("\n----------------------------------------------");
        
        // 3. Demostración de acceso a través de la relación (Unidireccional: Libro -> Autor)
        System.out.println("Acceso al Autor desde el Libro:");
        System.out.println("El autor del libro es: " + ficciones.getAutor().getNombre());
        
        // 4. Demostración de la Agregación (Libro puede existir sin Editorial, y viceversa, 
        // pero aquí el Libro tiene una referencia a la Editorial)
        System.out.println("Acceso a la Editorial desde el Libro:");
        System.out.println("La dirección de la editorial es: " + ficciones.getEditorial().getDireccion());
    }
 }
