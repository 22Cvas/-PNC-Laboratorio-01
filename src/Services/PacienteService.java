package Services;

import Model.Paciente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PacienteService {
    private List<Paciente> pacientes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void agregarPaciente() {
        System.out.println("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del paciente: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el DUI: ");
        String dui = scanner.nextLine();

        Paciente paciente = new Paciente(nombre, apellido, dui, new Date());
        pacientes.add(paciente);
        System.out.println("Paciente agregado exitosamente.");
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}
