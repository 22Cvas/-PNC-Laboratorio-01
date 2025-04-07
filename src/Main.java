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
                    System.out.println("Ingrese el nombre del doctor: ");
                    String doctorNombre = scanner.nextLine();

                    System.out.println("Ingrese la fecha de contratación del doctor (formato yyyy-MM-dd): ");
                    String fechaTexto = scanner.nextLine();
                    Date fechaRecruitment;
                    try {
                        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                        fechaRecruitment = formato.parse(fechaTexto);
                    } catch (Exception e) {
                        System.out.println("Fecha inválida. Se usará la fecha actual.");
                        fechaRecruitment = new Date();
                    }

                    Doctor doctor = new Doctor("DOC-001", doctorNombre, "Apellido", "12345678-9", fechaRecruitment, new Date());

                    System.out.println("Ingrese el nombre del paciente: ");
                    String pacienteNombre = scanner.nextLine();
                    Person person = new Person(pacienteNombre, "Apellido", "00000000-0", new Date());

                    System.out.println("Ingrese la especialidad: ");
                    String especialidad = scanner.nextLine();

                    citaService.agendarCita(doctor, person, new Date());
                    break;




                    /*
                    System.out.println("Ingrese el nombre del doctor: ");
                    String doctorNombre = scanner.nextLine();
                    Doctor doctor = new Doctor("DOC-001", doctorNombre, "Apellido", "12345678-9", "dateRecruitment", new java.util.Date());

                    System.out.println("Ingrese el nombre del paciente: ");
                    String pacienteNombre = scanner.nextLine();
                    Person Person = new Person(pacienteNombre, "Apellido", "00000000-0", new java.util.Date());

                    System.out.println("Ingrese la especialidad: ");
                    String especialidad = scanner.nextLine();

                    citaService.agendarCita(doctor, Person, especialidad);*/
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
