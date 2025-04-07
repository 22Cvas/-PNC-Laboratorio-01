package Services;

import Model.Doctor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DoctorService {

    private Scanner scanner = new Scanner(System.in);

    public void agregarDoctor() {
        try {
            System.out.print("Ingrese el ID del doctor: ");
            String id = scanner.nextLine();

            System.out.print("Ingrese el nombre del doctor: ");
            String firstName = scanner.nextLine();

            System.out.print("Ingrese el apellido del doctor: ");
            String lastName = scanner.nextLine();

            System.out.print("Ingrese el DUI del doctor: ");
            String dui = scanner.nextLine();

            System.out.print("Ingrese la fecha de contratación (dd/MM/yyyy): ");
            String fechaTexto = scanner.nextLine();

            System.out.print("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
            String fechaNacimientoTexto = scanner.nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaContratacion = sdf.parse(fechaTexto);
            Date fechaNacimiento = sdf.parse(fechaNacimientoTexto);

            Doctor doctor = new Doctor(id, firstName, lastName, dui, fechaContratacion, fechaNacimiento);

            // Aquí podrías guardar el doctor en una lista si tienes una, o simplemente mostrarlo
            System.out.println("Doctor agregado con éxito:");
            System.out.println("Nombre: " + doctor.getFirstName() + " " + doctor.getLastName());
        } catch (Exception e) {
            System.out.println("Error al agregar el doctor. Asegúrese de usar el formato de fecha correcto (dd/MM/yyyy).");
        }
    }
}
