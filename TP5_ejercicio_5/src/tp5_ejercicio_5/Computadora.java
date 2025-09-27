/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_5;

/**
 *
 * @author jimen
 */
public class Computadora {
    private String marca;
    private String numeroSerie;

    // Relación de Composición: Computadora *-- PlacaMadre
    // La PlacaMadre se crea DENTRO de la Computadora o se le asigna al inicio.
    private PlacaMadre placaMadre; 

    // Relación de Asociación Bidireccional: Computadora <-> Propietario
    private Propietario propietario; 

    // Creamos el constructor para inicializar una Computadora.
     
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        // Establecer el enlace en el otro sentido (Propietario -> Computadora)
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    // Getters 
    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; } // Getter para la Composición
    public Propietario getPropietario() { return propietario; } // Getter para la Asociación

    @Override
    public String toString() {
        String infoPropietario = (propietario != null) ? propietario.getNombre() : "No Asignado";
        return "Computadora [marca=" + marca + ", serie=" + numeroSerie + 
               ", Propietario=" + infoPropietario + ", " + 
               placaMadre.toString() + "]";
    }
}
