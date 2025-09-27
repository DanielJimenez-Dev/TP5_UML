/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ejercicio_5;

/**
 *
 * @author jimen
 */
public class TP5_ejercicio_5 {

    public static void main(String[] args) {
         // 1. Crear el objeto Propietario
        Propietario daniel = new Propietario("Daniel Jimenez", "1717177");
        
        // 2. Crear el objeto Computadora. La PlacaMadre se crea internamente aquí (Composición).
        Computadora pcGamer = new Computadora(
            "TechBrand", 
            "PCG-2024-001", 
            "Asus ROG Strix Z690", 
            "Intel Z690"
        );
        
        System.out.println("--- Objetos Creados ---");
        System.out.println(daniel);
        System.out.println(pcGamer);
        
        // 3. Establecer la Asociación Bidireccional
        // Solo necesitamos llamar a un lado del setter, y la lógica interna se encarga del otro lado.
        pcGamer.setPropietario(daniel);
        
        System.out.println("\n--- Asociación Bidireccional Establecida ---");
        
        // *** VERIFICACIÓN DE LA ASOCIACIÓN BIDIRECCIONAL ***
        
        // 1. Sentido Computadora -> Propietario
        System.out.println("Verificación Bidireccional: Computadora conoce a su Propietario:");
        System.out.println("  - Propietario de la " + pcGamer.getMarca() + ": " + pcGamer.getPropietario().getNombre());
        
        // 2. Sentido Propietario -> Computadora
        System.out.println("\n Verificación Bidireccional: Propietario conoce su Computadora:");
        System.out.println("  - La PC de " + daniel.getNombre() + " tiene serie: " + daniel.getComputadora().getNumeroSerie());

        System.out.println("\n------------------------------------------------");
        
        // *** VERIFICACIÓN DE LA COMPOSICIÓN ***
        
        // Sentido Computadora -> PlacaMadre
        System.out.println(" Verificación Composición: La PlacaMadre es parte de la Computadora:");
        System.out.println("  - Modelo de Placa Madre en la PC: " + pcGamer.getPlacaMadre().getModelo());
        
          }
}
