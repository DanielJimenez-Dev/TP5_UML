/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ejercicio_4;

public class TP5_ejercicio_4 {

    public static void main(String[] args) {
        
        // 1. Crear el objeto Banco (parte independiente de la Agregación)
        Banco bancoNacion = new Banco("Banco Nación", "30-50000000-0");
        
        // 2. Crear el objeto Cliente
        Cliente danieljimenez = new Cliente("Daniel Jimenez", "30123456");
        
        // 3. Crear objetos TarjetaDeCrédito
        // Al crear la tarjeta, se establecen las dos relaciones:
        // - Tarjeta -> Cliente (bidireccional)
        // - Tarjeta -> Banco (agregación unidireccional)
        TarjetaDeCredito visa = new TarjetaDeCredito("171717-xxxx-xxxx-9874", "12/31", danieljimenez, bancoNacion);
        TarjetaDeCredito mastercard = new TarjetaDeCredito("5400-xxxx-xxxx-9876", "10/25", danieljimenez, bancoNacion);

        System.out.println("--- Información de los objetos ---");
        System.out.println(danieljimenez);
        System.out.println(visa);
        System.out.println(mastercard);
        System.out.println("----------------------------------\n");
        
        // *** VERIFICACIÓN DE LA ASOCIACIÓN BIDIRECCIONAL ***
        
        // 1. Sentido Cliente -> Tarjeta
        System.out.println("Verificación Bidireccional: Cliente conoce sus tarjetas:");
        for (TarjetaDeCredito tarjeta : danieljimenez.getTarjetas()) {
            System.out.println("  - Cliente " + danieljimenez.getNombre() + " posee la tarjeta: " + tarjeta.getNumero());
        }
        
        // 2. Sentido Tarjeta -> Cliente
        System.out.println("\nVerificación Bidireccional: Tarjeta conoce a su cliente:");
        System.out.println("  - La tarjeta " + visa.getNumero() + " pertenece a: " + visa.getCliente().getDni());
        
        System.out.println("\n----------------------------------");
        
        // *** VERIFICACIÓN DE LA AGREGACIÓN UNIDIRECCIONAL ***
        
        // Sentido Tarjeta -> Banco
        System.out.println("✅ Verificación Agregación: Tarjeta conoce al banco emisor:");
        System.out.println("  - La tarjeta " + visa.getNumero() + " fue emitida por: " + visa.getBanco().getNombre());
    }
    }

