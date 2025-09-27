/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ejercicio_1;

/**
 *
 * @author jimen
 */
public class TP5_ejercicio_1 {
    
    public static void main(String[] args) {
        
        // 1. Creamos el Titular
        Titular t1 = new Titular("Daniel Jimenez", 17171717);
        System.out.println("Estado inicial del Titular: " + t1.verificarPasaporte());
        
        // 2. Creamos el Pasaporte
        Pasaporte p1 = new Pasaporte(
            1001, 
            "2025-09-26", 
            t1, // Pasamos la referencia del Titular
            "/imagenes/daniel_jimenez_foto.png" // Datos para la Foto (Composición)
        );
        
        System.out.println("\n--- OBJETO CREADO ---");
        System.out.println(p1);
        
        System.out.println("\n--- PRUEBA DE RELACIONES ---");
        
        // Prueba de Composición (Pasaporte accede a la Foto)
        System.out.println("Pasaporte accede a su Foto: " + p1.getFoto().getRutaArchivo());
        
        // Prueba de Asociación Bidireccional (Titular puede acceder al Pasaporte)
        System.out.println("Titular verifica su Pasaporte: " + t1.verificarPasaporte());
        
    }
    }
    

