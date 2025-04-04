package Model;

import java.util.Date;

public class Paciente {
    private String nombre, apellido, dui;
    private Date fechaNacimiento;

    public Paciente(String nombre, String apellido, String dui, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDui() { return dui; }
    public Date getFechaNacimiento() { return fechaNacimiento; }

}
