/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String dni;
    
    // Relación de Asociación Bidireccional: Cliente <-> TarjetaDeCrédito (Muchos)
    private List<TarjetaDeCredito> tarjetas; 

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        // Inicializar la lista para poder agregar tarjetas
        this.tarjetas = new ArrayList<>();
    }
    
    // Método para manejar la parte bidireccional de la asociación
    public void agregarTarjeta(TarjetaDeCredito tarjeta) {
        // Evita duplicados, si es necesario, se puede refinar la lógica.
        if (!tarjetas.contains(tarjeta)) {
            tarjetas.add(tarjeta);
        }
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    
    // El getter devuelve una copia de la lista (o la lista misma)
    public List<TarjetaDeCredito> getTarjetas() { 
        return tarjetas; 
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", dni=" + dni + ", totalTarjetas=" + tarjetas.size() + "]";
    }
}
