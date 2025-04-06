package Services;

import Model.Appointment;
import Model.Doctor;
import Model.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AppointmentService {
    private List<Appointment> citas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void listarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas registradas.");
            return;
        }
        for (Appointment c : citas) {
            System.out.println("\nDoctor: " + c.getDoctor().getNombre() + " " + c.getDoctor().getApellido());
            System.out.println("Paciente: " + c.getPaciente().getNombre() + " " + c.getPaciente().getApellido());
            System.out.println("Especialidad: " + c.getEspecialidad());
            System.out.println("Fecha: " + c.getFecha());
            System.out.println("Asistió: " + (c.isAsistio() ? "Sí" : "No"));
        }
    }

    public void agendarCita(Doctor doctor, Person paciente, String especialidad) {
        Date fecha = new Date();
        Appointment cita = new Appointment(doctor, paciente, especialidad, fecha, false);
        citas.add(cita);
        System.out.println("Cita agendada con éxito.");
    }
}
