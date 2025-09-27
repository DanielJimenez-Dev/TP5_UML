/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_7;

public class Conductor {
    private String nombre;
    private String licencia;
    
    // Relación de Asociación Bidireccional: Conductor <-> Vehículo
    private Vehiculo vehiculoAsignado; 

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    public void setVehiculoAsignado(Vehiculo vehiculo) {
        this.vehiculoAsignado = vehiculo;
        
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this); // Llama al método del Vehiculo
        }
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getLicencia() { return licencia; }
    public Vehiculo getVehiculoAsignado() { return vehiculoAsignado; }

    @Override
    public String toString() {
        String patente = (vehiculoAsignado != null) ? vehiculoAsignado.getPatente() : "Ninguno";
        return "Conductor [nombre=" + nombre + ", licencia=" + licencia + ", vehículo=" + patente + "]";
    }
}
