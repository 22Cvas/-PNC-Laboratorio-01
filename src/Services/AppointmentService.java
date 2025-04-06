package Services;

import Model.Citas;
import Model.Doctor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AppointmentService {
    private List<Citas> citas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void listarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas registradas.");
            return;
        }
        for (Citas c : citas) {
            System.out.println("\nDoctor: " + c.getDoctor().getNombre() + " " + c.getDoctor().getApellido());
            System.out.println("Paciente: " + c.getPaciente().getNombre() + " " + c.getPaciente().getApellido());
            System.out.println("Especialidad: " + c.getEspecialidad());
            System.out.println("Fecha: " + c.getFecha());
            System.out.println("Asistió: " + (c.isAsistio() ? "Sí" : "No"));
        }
    }

    public void agendarCita(Doctor doctor, Paciente paciente, String especialidad) {
        Date fecha = new Date();
        Citas cita = new Citas(doctor, paciente, especialidad, fecha, false);
        citas.add(cita);
        System.out.println("Cita agendada con éxito.");
    }
}
