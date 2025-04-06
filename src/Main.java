import Model.Doctor;
import Model.Paciente;
import Services.CitaService;
import Services.DoctorService;
import Services.PacienteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoctorService doctorService = new DoctorService();
        PacienteService pacienteService = new PacienteService();
        CitaService citaService = new CitaService();

        while (true) {
            System.out.println("\nSistema de Citas Médicas");
            System.out.println("1. Agregar Doctor");
            System.out.println("2. Agregar Paciente");
            System.out.println("3. Agendar Cita");
            System.out.println("4. Listar Citas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    doctorService.agregarDoctor();
                    break;
                case 2:
                    pacienteService.agregarPaciente();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del doctor: ");
                    String doctorNombre = scanner.nextLine();
                    Doctor doctor = new Doctor("DOC-001", doctorNombre, "Apellido", "12345678-9", "Especialidad", new java.util.Date());

                    System.out.println("Ingrese el nombre del paciente: ");
                    String pacienteNombre = scanner.nextLine();
                    Paciente paciente = new Paciente(pacienteNombre, "Apellido", "00000000-0", new java.util.Date());

                    System.out.println("Ingrese la especialidad: ");
                    String especialidad = scanner.nextLine();

                    citaService.agendarCita(doctor, paciente, especialidad);
                    break;
                case 4:
                    citaService.listarCitas();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
