/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_10;

public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    // --- Getters y Setters ---
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getUltimaModificacion() { return ultimaModificacion; }
    public void setUltimaModificacion(String ultimaModificacion) { this.ultimaModificacion = ultimaModificacion; }

    @Override
    public String toString() {
        return "ClaveSeguridad [codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + "]";
    }
}
