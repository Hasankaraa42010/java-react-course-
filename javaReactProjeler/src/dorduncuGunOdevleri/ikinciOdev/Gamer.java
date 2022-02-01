package dorduncuGunOdevleri.ikinciOdev;

import java.time.LocalDate;

public class Gamer {

    private String name;
    private String lastname;
    private LocalDate dateOfBirth;
    private String nationalityId;
    public Gamer(){

    }

    public Gamer(String name, String lastname, LocalDate dateOfBirth, String nationalityId) {
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
}
