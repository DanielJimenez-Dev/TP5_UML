/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_8;

/**
 *
 * @author jimen
 */
public class Documento {
    private String titulo;
    private String contenido;

    // Relación de Composición: Documento *-- FirmaDigital
    private FirmaDigital firma; 

    // CRemos los constructores para inicializar el Documento.
     
    public Documento(String titulo, String contenido, String codigoHash, String fechaFirma, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        
        // IMPLEMENTACIÓN DE COMPOSICIÓN: La FirmaDigital nace con el Documento.
        // También establece la Agregación FirmaDigital -> Usuario
        this.firma = new FirmaDigital(codigoHash, fechaFirma, usuario); 
    }

    // --- Getters y Setters ---
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    // Getter para la Composición (Firma)
    public FirmaDigital getFirma() { return firma; }

    @Override
    public String toString() {
        String infoFirma = (firma != null) ? "FIRMADO por " + firma.getUsuario().getNombre() : "SIN FIRMAR";
        
        return "Documento:\n" +
               "  - Título: " + titulo + "\n" +
               "  - Contenido: (extracto...)\n" +
               "  - Estado: " + infoFirma + "\n" +
               "  - Detalle Hash: " + firma.getCodigoHash();
    }
}
