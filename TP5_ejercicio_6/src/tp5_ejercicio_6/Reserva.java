/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_6;

public class Reserva {
    private String fecha;
    private String hora;

    // Relación de Asociación Unidireccional: Reserva -> Cliente
    private Cliente cliente; 

    // Relación de Agregación: Reserva -> Mesa
    private Mesa mesa; 

    //Creamos el constructor para inicializar una Reserva con sus relaciones.
    
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;   // Asignación de la Asociación
        this.mesa = mesa;         // Asignación de la Agregación
    }

    // --- Getters y Setters (incluyendo los de las relaciones) ---
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    // Getter para la Asociación (Cliente)
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    // Getter para la Agregación (Mesa)
    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }

    /**
     * Método para mostrar la información completa de la Reserva y sus objetos relacionados.
     */
    @Override
    public String toString() {
        return "--- Detalle de Reserva ---\n" +
               "  - Fecha: " + fecha + ", Hora: " + hora + "\n" +
               "  - Cliente: " + cliente.getNombre() + " (" + cliente.getTelefono() + ")\n" +
               "  - Mesa Asignada: " + mesa.getNumero() + " (Capacidad: " + mesa.getCapacidad() + ")";
    }
}
