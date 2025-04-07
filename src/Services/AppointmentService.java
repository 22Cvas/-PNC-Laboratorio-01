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
            System.out.println("\nDoctor: " + c.getDoctor().getFirstName() + " " + c.getDoctor().getLastName());
            System.out.println("Paciente: " + c.getPatient().getFirstName()+ " " + c.getPatient().getLastName());
            System.out.println("Especialidad: " + c.getDoctor().getSpecialty().getName());
            System.out.println("Fecha: " + c.getDate().toString());
            System.out.println("Asistió: " + (c.isAttended() ? "Sí" : "No"));
        }
    }

    public void agendarCita(Doctor doctor, Person paciente, Date fecha) {
        Date fechaActual = new Date(); // ✅ nombre diferente
        Appointment cita = new Appointment(doctor, paciente,  fechaActual, false);
        citas.add(cita);
    }

}
