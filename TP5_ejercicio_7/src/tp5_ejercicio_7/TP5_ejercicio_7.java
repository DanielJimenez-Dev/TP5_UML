/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ejercicio_7;

/**
 *
 * @author jimen
 */
public class TP5_ejercicio_7 {

    public static void main(String[] args) {
        // 1. Crear objetos independientes (Motor y Conductor)
        Motor motorDiesel = new Motor("Diesel V8", "88456-D");
        Conductor daniel = new Conductor("Daniel Jimenez", "DJ-5555");
        
        System.out.println("--- Objetos base creados ---");
        System.out.println(motorDiesel);
        System.out.println(daniel);
        System.out.println("----------------------------\n");

        // 2. Crear el Vehículo, estableciendo la Agregación con el Motor
        Vehiculo camioneta = new Vehiculo("XYZ-901", "Ford Ranger", motorDiesel);
        
        System.out.println("--- Vehículo Creado con Agregación ---");
        System.out.println(camioneta);
        
        // 3. Establecer la Asociación Bidireccional
        // Llamamos a UN SOLO lado del setter, y la lógica interna cierra el ciclo.
        camioneta.setConductor(daniel); 

        System.out.println("\n--- Asociación Bidireccional Establecida ---");
        
        // *** VERIFICACIÓN DE LA ASOCIACIÓN BIDIRECCIONAL ***
        
        // 1. Sentido Vehículo -> Conductor
        System.out.println(" Verificación Bidireccional: Vehículo conoce a su Conductor:");
        System.out.println("  - El conductor de la patente " + camioneta.getPatente() + " es: " + camioneta.getConductor().getNombre());
        
        // 2. Sentido Conductor -> Vehículo (Esta línea causaba el NPE)
        System.out.println(" Verificación Bidireccional: Conductor conoce su Vehículo:");
        System.out.println("  - El vehículo asignado a " + daniel.getNombre() + " es el modelo: " + daniel.getVehiculoAsignado().getModelo());

        System.out.println("\n--- Verificación de la Agregación ---");
        
        // Sentido Vehículo -> Motor
        System.out.println(" Verificación Agregación: Vehículo conoce su Motor:");
        System.out.println("  - El Motor es de tipo: " + camioneta.getMotor().getTipo());
    }
}

