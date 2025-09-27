/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_2;

/**
 *
 * @author jimen
 */
public class Celular {
   private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;  // Agregación
    private Usuario usuario;  // Asociación bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        usuario.setCelular(this); // mantiene la bidirección
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "imei='" + imei + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bateria=" + bateria +
                ", usuario=" + (usuario != null ? usuario.getCelular().getMarca() + " " 
                + usuario.getCelular().getModelo() : "Sin usuario") +
                '}';
    }
}
