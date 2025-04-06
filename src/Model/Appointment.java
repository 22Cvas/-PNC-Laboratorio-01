package Model;

import java.time.LocalDate;
import java.util.Date;

public class Appointment {

    private Doctor doctor;
    private Person patient;
    private LocalDate date;
    private boolean attended;

    public Appointment(Doctor doctor, Person patient, LocalDate date, boolean attended) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.attended = attended;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Person getPatient() {
        return patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isAttended() {
        return attended;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setAttended(boolean attended) {
        this.attended = attended;
    }
}
