/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;

    // Relación de Composición: CuentaBancaria *-- ClaveSeguridad
    private ClaveSeguridad clave; 

    // Relación de Asociación Bidireccional: CuentaBancaria <--> Titular
    private Titular titular; 

    // CReamos los constructores para inicializar una CuentaBancaria.
    
    public CuentaBancaria(String cbu, double saldoInicial, String codigoClave, String fechaModificacion) {
        this.cbu = cbu;
        this.saldo = saldoInicial;
        
        // IMPLEMENTACIÓN DE COMPOSICIÓN: La ClaveSeguridad se crea aquí.
        this.clave = new ClaveSeguridad(codigoClave, fechaModificacion);
    }
    
    /**
     * Establece la relación bidireccional desde el lado de la Cuenta. 
     * Al asignarle un Titular, se asegura que el Titular también tenga esta Cuenta asignada.
     */
    public void setTitular(Titular titular) {
        this.titular = titular;
        // Cierra el ciclo bidireccional: Titular -> CuentaBancaria
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    // --- Getters ---
    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClave() { return clave; } // Getter para la Composición
    public Titular getTitular() { return titular; } // Getter para la Asociación

    @Override
    public String toString() {
        String infoTitular = (titular != null) ? titular.getNombre() : "N/A";
        return "CuentaBancaria [CBU=" + cbu + ", saldo=" + saldo + 
               ", Titular=" + infoTitular + ", " + 
               clave.toString() + "]";
    }
}
