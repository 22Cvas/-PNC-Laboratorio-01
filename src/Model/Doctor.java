package Model;

import java.time.LocalDate;
import java.util.Date;

public class Doctor extends Person {

    private String id;
    private LocalDate dateRecruitment;
    private Specialty specialty;

    public Doctor(String id, String firstName, String lastName, String dui, LocalDate dateRecruitment, LocalDate birthDay) {
        super(firstName, lastName, dui, birthDay);
        this.id = id;
        this.dateRecruitment = dateRecruitment;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public String getId() {
        return id;
    }

    public void setId(String code) {
        this.id = code;
    }

    public LocalDate getDateRecruitment() {
        return dateRecruitment;
    }

    public void setDateRecruitment(LocalDate dateRecruitment) {
        this.dateRecruitment = dateRecruitment;
    }
}
