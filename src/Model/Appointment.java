package Model;

import java.util.Date;

public class Appointment {

    private Doctor doctor;
    private Person paciente;
    private Specialty specialty;
    private Date fecha;
    private Date fechaFin;
    private boolean asistio;

    // Constructor actualizado
    public Appointment(Doctor doctor, Person paciente, Specialty specialty, Date fecha, Date fechaFin, boolean asistio) {
        this.doctor = doctor;
        this.paciente = paciente;
        this.specialty = specialty;
        this.fecha = fecha;
        this.fechaFin = fechaFin;
        this.asistio = asistio;
    }

    // Métodos getter y setter
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Person getPaciente() {
        return paciente;
    }

    public void setPaciente(Person paciente) {
        this.paciente = paciente;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }
}
