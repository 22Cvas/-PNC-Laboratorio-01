package Services;

import Model.Person;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientService {
    private List<Person> patients = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addPatient() {
        System.out.println("Ingrese el nombre del paciente: ");
        String firstName = scanner.nextLine();

        System.out.println("Ingrese el apellido del paciente: ");
        String lastName = scanner.nextLine();

        System.out.println("Ingrese el DUI: ");
        String dui = scanner.nextLine();

        System.out.println("Ingrese su Cumpleanos: ");
        String birthDay = scanner.nextLine();

        Person paciente = new Person(firstName, lastName, dui, stringToDate(birthDay));
        patients.add(paciente);
        System.out.println("Paciente agregado exitosamente.");
    }

    public List<Person> getPatients() {

        return patients;
    }

    public Person getPatientByDui(){
        System.out.println("Ingrese DUI del paciente: ");
        String dui = scanner.nextLine();

        return (Person) patients.stream().filter(p -> p.getDui().equals(dui)).toList();
    }

    public LocalDate stringToDate(String birthDay) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            return LocalDate.parse(birthDay, formatter);
        }catch (Exception e)
        {
            System.out.println("Usar formato dd/mm/yyyy");
        }
        return null;
    }

    public boolean validateAge(LocalDate birthDay){
        if (Period.between(birthDay, LocalDate.now()).getYears() < 18){
        }
    }

}
