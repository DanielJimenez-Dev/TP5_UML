/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_1;

/**
 *
 * @author jimen
 */
public class Pasaporte {
    private int numero;
    private String fechaEmision;
    private Foto foto;          // Atributo de COMPOSICIÓN (objeto dependiente)
    private Titular titular;    // Atributo de ASOCIACIÓN (objeto independiente)

    // Constructor que maneja ambas relaciones
    public Pasaporte(int numero, String fechaEmision, Titular titular, String rutaFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.titular = titular;

        // 1. COMPOSICIÓN: Creamos la 'Foto' internamente
        this.foto = new Foto(rutaFoto); 
        
        // 2. ASOCIACIÓN BIDIRECCIONAL: Le decimos al Titular quién es su Pasaporte.
        titular.setPasaporte(this);
    }
    
    public Foto getFoto() { return foto; }
    
    public int getNumero() { return numero; }

    @Override
    public String toString() {
        return "PASAPORTE #" + numero + " | Titular: " + titular.getNombre() + 
               " | Foto: " + foto.getRutaArchivo() + " (Composición)";
    }
}
