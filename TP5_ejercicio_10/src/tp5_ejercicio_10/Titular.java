/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_10;

public class Titular {
    private String nombre;
    private String dni;
    
    // Relación de Asociación Bidireccional: Titular <-> CuentaBancaria
    private CuentaBancaria cuenta; 

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //Establece la relación bidireccional desde el lado del Titular. 
    //Cuando se asigna una cuenta, se asegura que la Cuenta también sepa quién es su Titular.
    
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        // Cierra el ciclo bidireccional: CuentaBancaria -> Titular
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }
    
    // --- Getters ---
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public CuentaBancaria getCuenta() { return cuenta; }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + "]";
    }
}
