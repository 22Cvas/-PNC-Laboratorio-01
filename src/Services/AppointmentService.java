package Services;

import Model.Appointment;
import Model.Doctor;
import Model.Person;
import Model.Specialty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentService {

    private List<Appointment> citas = new ArrayList<>();
    private DoctorService doctorService = new DoctorService();
    private PatientService patientService = new PatientService();

    // Método para agendar una cita
    public void agendarCita(String nombreDoctor, String nombrePaciente, String especialidad, Date fecha) {
        // Obtener doctor por nombre
        Doctor doctor = doctorService.obtenerDoctorPorNombre(nombreDoctor);
        if (doctor == null) {
            System.out.println("Doctor no encontrado.");
            return;
        }

        // Obtener paciente por nombre
        Person paciente = patientService.obtenerPacientePorNombre(nombrePaciente);
        if (paciente == null) {
            System.out.println("Paciente no encontrado.");
            return;
        }

        // Obtener especialidad
        Specialty specialty = new Specialty(especialidad, 1);  // Aquí puedes modificar para obtenerla dinámicamente.

        // Verificar que la fecha y la cita no se solapen
        Date fechaFin = new Date(fecha.getTime() + 3600000); // Sumar una hora a la fecha de la cita (3600000 ms = 1 hora)

        if (!validarCita(fecha, fechaFin)) {
            System.out.println("La cita se solapa con otra existente.");
            return;
        }

        // Crear la cita
        Appointment nuevaCita = new Appointment(doctor, paciente, specialty, fecha, fechaFin, false);
        citas.add(nuevaCita);
        System.out.println("Cita agendada con éxito.");
    }

    // Método para validar si la cita no se solapa con otra existente
    public boolean validarCita(Date fechaInicio, Date fechaFin) {
        for (Appointment cita : citas) {
            // Verificar si las fechas se solapan
            if (fechaInicio.before(cita.getFechaFin()) && fechaFin.after(cita.getFecha())) {
                return false; // Las fechas se solapan
            }
        }
        return true; // No hay solapamientos
    }

    // Método para listar todas las citas
    public void listarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas agendadas.");
            return;
        }

        for (Appointment cita : citas) {
            System.out.println("Cita con Dr. " + cita.getDoctor().getFirstName() + " para " + cita.getPaciente().getFirstName() +
                    " en la especialidad " + cita.getSpecialty().getName() + " a las " + cita.getFecha());
        }
    }
}
