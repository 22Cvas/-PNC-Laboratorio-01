package Model;

import java.time.LocalDate;
import java.util.Date;

public class Person {

 private String firstName, lastName, dui;
 private LocalDate birthDay;

    public Person(String firstName, String lastname, String dui, LocalDate birthDay) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.dui = dui;
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDui() {
        return dui;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }
}
