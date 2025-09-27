/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_5;

/**
 *
 * @author jimen
 */
public class Propietario {
    private String nombre;
    private String dni;
    
    // Relación de Asociación Bidireccional: Propietario <-> Computadora (Uno)
    private Computadora computadora; 

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Computadora getComputadora() { return computadora; }

    @Override
    public String toString() {
        return "Propietario [nombre=" + nombre + ", dni=" + dni + "]";
    }
}
