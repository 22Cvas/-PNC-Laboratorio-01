package Model;

import java.util.Date;

public class Doctor {

    private String codigo, nombre, apellido, dui, especialidad;
    private Date fechaReclutamiento;

    public Doctor(String codigo, String nombre, String apellido, String dui, String especialidad, Date fechaReclutamiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.especialidad = especialidad;
        this.fechaReclutamiento = fechaReclutamiento;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDui() { return dui; }
    public String getEspecialidad() { return especialidad; }
    public Date getFechaReclutamiento() { return fechaReclutamiento; }
}
