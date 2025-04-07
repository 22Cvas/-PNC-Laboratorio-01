package Services;

import Model.Person;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class PatientService {

    private Scanner scanner = new Scanner(System.in);

    public void addPatient() {
        try {
            System.out.print("Ingrese el nombre del paciente: ");
            String firstName = scanner.nextLine();

            System.out.print("Ingrese el apellido del paciente: ");
            String lastName = scanner.nextLine();

            System.out.print("Ingrese el DUI del paciente: ");
            String dui = scanner.nextLine();

            // Obtener la fecha de nacimiento como LocalDate
            System.out.print("Ingrese la fecha de nacimiento (yyyy-MM-dd): ");
            String fechaTexto = scanner.nextLine();
            LocalDate localDate = LocalDate.parse(fechaTexto);

            // Convertir LocalDate a Date
            Date birthDay = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

            // Crear el paciente
            Person paciente = new Person(firstName, lastName, dui, birthDay);

            System.out.println("Paciente agregado con éxito.");
        } catch (Exception e) {
            System.out.println("Error al agregar el paciente. Asegúrese de usar el formato de fecha correcto (yyyy-MM-dd).");
        }
    }
}
