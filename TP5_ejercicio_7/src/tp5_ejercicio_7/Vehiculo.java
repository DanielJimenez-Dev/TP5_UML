/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_7;

public class Vehiculo {
    private String patente;
    private String modelo;

    // Relación de Agregación: Vehículo o--> Motor
    private Motor motor; 

    // Relación de Asociación Bidireccional: Vehículo <--> Conductor
    private Conductor conductor; 

    //Constructor para inicializar el Vehículo con un Motor ya existente (Agregación)
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; // Asignación de la Agregación
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        
        if (conductor != null && conductor.getVehiculoAsignado() != this) { 
            conductor.setVehiculoAsignado(this); // Llama al método del Conductor
        }
   }

    // --- Getters ---
    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; } // Getter para la Agregación
    public Conductor getConductor() { return conductor; } // Getter para la Asociación

    @Override
    public String toString() {
        String nombreConductor = (conductor != null) ? conductor.getNombre() : "N/A";
        return "Vehículo [patente=" + patente + ", modelo=" + modelo + 
               ", Conductor=" + nombreConductor + ", " + motor.toString() + "]";
    }
}
