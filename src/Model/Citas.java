package Model;

import java.util.Date;

public class Citas {

    private Doctor doctor;
    private Paciente paciente;
    private String especialidad;
    private Date fecha;
    private boolean asistio;

    public Citas(Doctor doctor, Paciente paciente, String especialidad, Date fecha, boolean asistio) {
        this.doctor = doctor;
        this.paciente = paciente;
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.asistio = asistio;
    }

    public Doctor getDoctor() { return doctor; }
    public Paciente getPaciente() { return paciente; }
    public String getEspecialidad() { return especialidad; }
    public Date getFecha() { return fecha; }
    public boolean isAsistio() { return asistio; }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }
}
