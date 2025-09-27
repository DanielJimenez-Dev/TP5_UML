/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ejercicio_6;

public class TP5_ejercicio_6 {

    public static void main(String[] args) {
        
        // 1. Crear objetos independientes (Cliente y Mesa)
        Cliente daniel = new Cliente("Daniel Jimenez", "351-555555");
        Mesa mesaVIP = new Mesa(10, 4); // Mesa 10 con capacidad para 4

        System.out.println("--- Objetos base creados ---");
        System.out.println(daniel);
        System.out.println(mesaVIP);
        System.out.println("----------------------------\n");
        
        // 2. Crear la Reserva, estableciendo la Asociación y la Agregación
        Reserva reservaAna = new Reserva("2025-10-20", "20:00", daniel, mesaVIP);

        System.out.println("--- Reserva Creada ---");
        System.out.println(reservaAna);

        System.out.println("\n--- Verificación de Relaciones ---");
        
        // Verificación de la Asociación (Reserva -> Cliente)
        String nombreCliente = reservaAna.getCliente().getNombre();
        System.out.println("Cliente de la reserva: " + nombreCliente);
        
        // Verificación de la Agregación (Reserva -> Mesa)
        int numeroMesa = reservaAna.getMesa().getNumero();
        System.out.println("Mesa asignada: " + numeroMesa);
     
    }
}
   
