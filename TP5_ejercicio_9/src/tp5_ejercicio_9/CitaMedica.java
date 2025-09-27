/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ejercicio_9;

public class CitaMedica {
    private String fecha;
    private String hora;

    // Relación de Asociación Unidireccional: CitaMedica -> Paciente
    private Paciente paciente; 

    // Relación de Asociación Unidireccional: CitaMedica -> Profesional
    private Profesional profesional; 

    //Constructor para inicializar una Cita Médica con sus dos asociaciones.
     
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;     // Asignación de la Asociación a Paciente
        this.profesional = profesional; // Asignación de la Asociación a Profesional
    }

    // --- Getters y Setters (incluyendo los de las relaciones) ---
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    // Getter para Paciente
    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    // Getter para Profesional
    public Profesional getProfesional() { return profesional; }
    public void setProfesional(Profesional profesional) { this.profesional = profesional; }

    //Método para mostrar la información completa de la Cita Médica y sus objetos relacionados.
     
    @Override
    public String toString() {
        return "--- Detalle de Cita Médica ---\n" +
               "  - Fecha: " + fecha + ", Hora: " + hora + "\n" +
               "  - Paciente: " + paciente.getNombre() + " (Obra Social: " + paciente.getObraSocial() + ")\n" +
               "  - Profesional: " + profesional.getNombre() + " (Especialidad: " + profesional.getEspecialidad() + ")";
    }
}
