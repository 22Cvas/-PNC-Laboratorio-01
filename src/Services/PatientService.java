package Services;

import Model.Person;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PatientService {

    private Scanner scanner = new Scanner(System.in);
    private List<Person> pacientes = new ArrayList<>();

    // Método para agregar un paciente
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

            // Imprimir el paciente guardado
            System.out.println("\nPaciente agregado con éxito.");
            System.out.println("Nombre: " + paciente.getFirstName() + " " + paciente.getLastName());
            System.out.println("DUI: " + paciente.getDui());
            System.out.println("Fecha de nacimiento: " + new SimpleDateFormat("yyyy-MM-dd").format(paciente.getBirthDay()));

        } catch (Exception e) {
            System.out.println("Error al agregar el paciente. Asegúrese de usar el formato de fecha correcto (yyyy-MM-dd).");
        }
    }


    // Método para listar pacientes
    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
            return;
        }
        for (Person paciente : pacientes) {
            System.out.println("DUI: " + paciente.getDui() + " - " + paciente.getFirstName() + " " + paciente.getLastName());
        }
    }

    // Método para obtener un paciente por su nombre
    public Person obtenerPacientePorNombre(String nombre) {
        for (Person paciente : pacientes) {
            if (paciente.getFirstName().equalsIgnoreCase(nombre)) {
                return paciente;
            }
        }
        return null;  // Si no se encuentra, retorna null
    }
}
