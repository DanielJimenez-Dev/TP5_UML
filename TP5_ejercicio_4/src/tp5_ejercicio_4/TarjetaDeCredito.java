/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_4;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;

    // Relación de Asociación Bidireccional: TarjetaDeCredito <-> Cliente (Uno)
    private Cliente cliente; 

    // Relación de Agregación Unidireccional: TarjetaDeCredito -> Banco
    private Banco banco; 

    // Creamos los Constructores para inicializar una Tarjeta de Crédito.
    
    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
    }
    
    // Getters y Setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    // Getter para la relación con Cliente
    public Cliente getCliente() { return cliente; }

    // Getter para la relación con Banco
    public Banco getBanco() { return banco; }


    @Override
    public String toString() {
        return "TarjetaDeCrédito [numero=" + numero + ", vencimiento=" + fechaVencimiento + 
               ", " + banco.toString() + "]";
    }
}
