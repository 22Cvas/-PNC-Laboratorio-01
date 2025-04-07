package Model;

import java.time.LocalDate;
import java.util.Date;

public class Person {

 private String firstName, lastName, dui;
 private Date birthDay;

    public Person(String firstName, String lastname, String dui, Date birthDay) {
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

    public Date getBirthDay() {
        return birthDay;
    }
}
