package Services;

import Model.Doctor;
import Model.Specialty;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DoctorService {

    private Scanner scanner = new Scanner(System.in);
    private List<Doctor> doctores = new ArrayList<>();

    // Método para generar el ID del doctor
    private String generarIdDoctor() {
        Random random = new Random();

        int x1 = random.nextInt(10); // un dígito
        char a1 = (char) ('A' + random.nextInt(26));
        int x2 = random.nextInt(10);
        char a2 = (char) ('A' + random.nextInt(26));
        int x3 = random.nextInt(10);

        return String.format("ZNH-%d%c%d-MD-%c%d!", x1, a1, x2, a2, x3);
    }

    // Método para agregar un doctor
    public void agregarDoctor() {
        System.out.print("Ingrese el nombre del doctor: ");
        String firstName = scanner.nextLine();

        System.out.print("Ingrese el apellido del doctor: ");
        String lastName = scanner.nextLine();

        System.out.print("Ingrese el DUI del doctor: ");
        String dui = scanner.nextLine();

        // Generar el ID del doctor automáticamente
        String id = generarIdDoctor();

        System.out.print("Ingrese la especialidad del doctor: ");
        String specialtyName = scanner.nextLine();
        Specialty specialty = new Specialty(specialtyName, new Random().nextInt(100));

        // Solicitar la fecha de nacimiento
        System.out.print("Ingrese la fecha de nacimiento (formato yyyy-MM-dd): ");
        String birthDateStr = scanner.nextLine();
        Date birthDate = new Date();  // Default date
        try {
            birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthDateStr);
        } catch (Exception e) {
            System.out.println("Fecha de nacimiento inválida, usando la fecha actual.");
        }

        // Solicitar la fecha de contratación
        System.out.print("Ingrese la fecha de contratación (formato yyyy-MM-dd): ");
        String recruitmentDateStr = scanner.nextLine();
        Date recruitmentDate = new Date();  // Default date
        try {
            recruitmentDate = new SimpleDateFormat("yyyy-MM-dd").parse(recruitmentDateStr);
        } catch (Exception e) {
            System.out.println("Fecha de contratación inválida, usando la fecha actual.");
        }

        // Crear el doctor con los datos recopilados
        Doctor doctor = new Doctor(id, firstName, lastName, dui, specialty, recruitmentDate, birthDate);
        doctores.add(doctor);

        System.out.println("Doctor agregado con éxito. ID: " + id);
    }

    // Método para listar doctores
    public void listarDoctores() {
        if (doctores.isEmpty()) {
            System.out.println("No hay doctores registrados.");
            return;
        }
        for (Doctor doctor : doctores) {
            System.out.println("ID: " + doctor.getId() + " - " + doctor.getFirstName() + " " + doctor.getLastName() + " - Especialidad: " + doctor.getSpecialty().getName());
        }
    }

    // Método para obtener un doctor por su primer nombre
    public Doctor obtenerDoctorPorNombre(String nombre) {
        for (Doctor doctor : doctores) {
            if (doctor.getFirstName().equalsIgnoreCase(nombre)) {
                return doctor;
            }
        }
        return null;  // Si no se encuentra, retorna null
    }

}
