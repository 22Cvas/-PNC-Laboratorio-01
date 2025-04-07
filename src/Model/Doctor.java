package Model;

import java.util.Date;

public class Doctor extends Person {

    private String id;
    private Date dateRecruitment;
    private Specialty specialty;

    // Constructor modificado para aceptar Specialty y Date de contratación y nacimiento
    public Doctor(String id, String firstName, String lastName, String dui, Specialty specialty, Date dateRecruitment, Date birthDay) {
        super(firstName, lastName, dui, birthDay);
        this.id = id;
        this.dateRecruitment = dateRecruitment;
        this.specialty = specialty;  // Guardar la especialidad del doctor
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

    public Date getDateRecruitment() {
        return dateRecruitment;
    }

    public void setDateRecruitment(Date dateRecruitment) {
        this.dateRecruitment = dateRecruitment;
    }
}
