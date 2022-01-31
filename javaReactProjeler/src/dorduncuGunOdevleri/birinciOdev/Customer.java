package dorduncuGunOdevleri.birinciOdev;

import java.time.LocalDate;
import java.util.Date;

public class Customer {
private String name;
private String lastName;
private LocalDate dateOfBirth;
private String nationalityId;
private int numberStars;
public Customer(){

}

    public Customer(String name, String lastName, LocalDate dateOfBirth, String nationalityId, int numberStars) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
        this.numberStars = numberStars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getNumberStars() {
        return numberStars;
    }

    public void setNumberStars(int numberStars) {
        this.numberStars = numberStars;
    }
}
