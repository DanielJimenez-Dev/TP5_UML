/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_8;

/**
 *
 * @author jimen
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;

    // Relación de Agregación: FirmaDigital o--> Usuario
    private Usuario usuario; 

    /**
     * Constructor para inicializar una Firma Digital con el Usuario que la realiza.
     */
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario; // Asignación de la Agregación (referencia a objeto externo)
    }

    // --- Getters y Setters ---
    public String getCodigoHash() { return codigoHash; }
    public void setCodigoHash(String codigoHash) { this.codigoHash = codigoHash; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    // Getter para la Agregación (Usuario)
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    @Override
    public String toString() {
        return "FirmaDigital [hash=" + codigoHash + ", fecha=" + fecha + "]";
    }
}
