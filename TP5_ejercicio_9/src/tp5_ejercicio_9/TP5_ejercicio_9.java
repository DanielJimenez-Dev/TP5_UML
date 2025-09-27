/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ejercicio_9;

/**
 *
 * @author jimen
 */
public class TP5_ejercicio_9 {

    public static void main(String[] args) {
        
        // 1. Crear objetos independientes: Paciente y Profesional
        Paciente daniel = new Paciente("daniel jimenez", "OSDE 210");
        Profesional drLopez = new Profesional("Dr. Juan Lopez", "Cardiología");

        System.out.println("--- Objetos base creados ---");
        System.out.println(daniel);
        System.out.println(drLopez);
        System.out.println("----------------------------\n");
        
        // 2. Crear la CitaMédica, estableciendo ambas Asociaciones Unidireccionales
        CitaMedica primeraCita = new CitaMedica("2025-12-15", "09:30", daniel, drLopez);

        System.out.println("--- Cita Médica Creada ---");
        System.out.println(primeraCita);

        System.out.println("\n--- Verificación de Asociaciones Unidireccionales ---");
        
        // 1. Verificación CitaMédica -> Paciente
        String nombrePaciente = primeraCita.getPaciente().getNombre();
        System.out.println(" La cita es para el paciente: " + nombrePaciente);
        
        // 2. Verificación CitaMédica -> Profesional
        String especialidadProfesional = primeraCita.getProfesional().getEspecialidad();
        System.out.println(" La cita es con el profesional de: " + especialidadProfesional);
    }
}
   
