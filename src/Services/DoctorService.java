package Services;

import Model.Doctor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DoctorService {
    private List<Doctor> doctores = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void agregarDoctor() {
        System.out.println("Ingrese el nombre del doctor: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del doctor: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el DUI: ");
        String dui = scanner.nextLine();

        System.out.println("Ingrese la especialidad: ");
        String especialidad = scanner.nextLine();

        Doctor doctor = new Doctor("DOC-" + (doctores.size() + 1), nombre, apellido, dui, especialidad, new Date());
        doctores.add(doctor);
        System.out.println("Doctor agregado exitosamente.");
    }

    public List<Doctor> getDoctores() {
        return doctores;
    }
}
