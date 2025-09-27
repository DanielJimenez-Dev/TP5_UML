/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ejercicio_8;

/**
 *
 * @author jimen
 */
public class TP5_ejercicio_8 {

    public static void main(String[] args) {
        
       // 1. Crear el objeto Usuario (independiente, necesario para la Agregación)
        Usuario daniel = new Usuario("Daniel Jimenez", "daniel.j@empresa.com");

        System.out.println("--- Usuario Creado ---");
        System.out.println(daniel);
        System.out.println("-----------------------------\n");
        
        // 2. Crear el Documento
        // Al crear el Documento, se crea internamente la FirmaDigital (Composición),
        // y esa FirmaDigital referencia al Usuario (Agregación).
        Documento contrato = new Documento(
            "Contrato de Servicios", 
            "El presente contrato establece las bases... ETC", 
            "b8523f-zxc123-2025", 
            "2025-12-26", 
            daniel
        );

        System.out.println("--- Documento Creado con Firma ---");
        System.out.println(contrato);
        
        System.out.println("\n--- Verificación de Relaciones ---");
        
        // 1. Verificación de Composición (Documento -> FirmaDigital)
        String hash = contrato.getFirma().getCodigoHash();
        System.out.println(" Documento accede al Hash de su firma: " + hash);
        
        // 2. Verificación de Agregación (FirmaDigital -> Usuario)
        String emailFirmante = contrato.getFirma().getUsuario().getEmail();
        System.out.println(" Firma accede al email del firmante: " + emailFirmante);
        
        // DEMOSTRACIÓN CONCEPTUAL DE COMPOSICIÓN:
        // Si elimináramos 'contrato' (contrato = null;), la 'FirmaDigital'
        // no podría ser accedida, reforzando que su existencia dependía del Documento.
        
        // Sin embargo, el objeto 'javier' sigue existiendo:
        System.out.println("\nUsuario sigue existiendo: " + daniel.getNombre());
    } 
}
   
