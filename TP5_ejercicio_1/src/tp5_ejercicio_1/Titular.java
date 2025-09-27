/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_1;

/**
 *
 * @author jimen
 */
public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte; // Referencia para la bidireccionalidad

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.pasaporte = null; 
    }

    // Método para completar la relación Bidireccional
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
    
    // Método para mostrar su Pasaporte (prueba de la bidireccionalidad)
    public String verificarPasaporte() {
        return (pasaporte != null) ? "Tiene Pasaporte Nro: " + pasaporte.getNumero() : "No tiene Pasaporte.";
    }
    
    public String getNombre() { return nombre; }
}
