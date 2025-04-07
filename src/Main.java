import Model.Doctor;
import Services.AppointmentService;
import Services.DoctorService;
import Services.PatientService;
import Model.Person;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoctorService doctorService = new DoctorService();
        PatientService pacienteService = new PatientService();
        AppointmentService citaService = new AppointmentService();

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
                    pacienteService.addPatient();
                    break;
                case 3:
                    // En el Main.java, donde agregas la opción de listar doctores:
                    doctorService.listarDoctores();  // Esto imprimirá todos los doctores registrados

                    System.out.println("Ingrese el nombre del doctor: ");
                    String doctorNombre = scanner.nextLine();


                    System.out.println("Ingrese el nombre del paciente: ");
                    String pacienteNombre = scanner.nextLine();

                    System.out.println("Ingrese la especialidad: ");
                    String especialidad = scanner.nextLine();

                    System.out.println("Ingrese la fecha de la cita (formato yyyy-MM-dd HH:mm): ");
                    String fechaTexto = scanner.nextLine();
                    Date fechaCita;
                    try {
                        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                        fechaCita = formato.parse(fechaTexto);
                    } catch (Exception e) {
                        System.out.println("Fecha inválida. Se usará la fecha actual.");
                        fechaCita = new Date();
                    }

                    citaService.agendarCita(doctorNombre, pacienteNombre, especialidad, fechaCita);
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
