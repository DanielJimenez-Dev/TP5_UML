/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ejercicio_10;

/**
 *
 * @author jimen
 */
public class TP5_ejercicio_10 {

    public static void main(String[] args) {
        
        // 1. Crear el objeto Titular
        Titular daniel = new Titular("Daniel Jimenez", "17171717");
        
        // 2. Crear el objeto CuentaBancaria (la ClaveSeguridad se crea internamente)
        CuentaBancaria cuentaDaniel = new CuentaBancaria(
            "1234567890123456789012", 
            50000.50, 
            "54321", 
            "2025-03-02"
        );
        
        System.out.println("--- Cuenta creada ---");
        System.out.println(daniel);
        System.out.println(cuentaDaniel);
        
        // 3. Establecer la Asociación Bidireccional
        // Llamamos a UN SOLO lado del setter, y la lógica interna cierra el ciclo.
        cuentaDaniel.setTitular(daniel);
        
        System.out.println("\n--- Asociación Bidireccional Establecida ---");
        
        // *** VERIFICACIÓN DE LA ASOCIACIÓN BIDIRECCIONAL ***
        
        // 1. Sentido CuentaBancaria -> Titular
        System.out.println(" Cuenta conoce a su Titular:");
        System.out.println("  - El DNI del titular es: " + cuentaDaniel.getTitular().getDni());
        
        // 2. Sentido Titular -> CuentaBancaria
        System.out.println(" Titular conoce su Cuenta:");
        System.out.println("  - El saldo de la cuenta de " + daniel.getNombre() + " es: " + daniel.getCuenta().getSaldo());

        System.out.println("\n--- Verificación de la Composición ---");
        
        // Sentido CuentaBancaria -> ClaveSeguridad
        System.out.println(" Cuenta accede a su Clave de Seguridad:");
        System.out.println("  - Última modificación de clave: " + cuentaDaniel.getClave().getUltimaModificacion());
      
    }
}
    

