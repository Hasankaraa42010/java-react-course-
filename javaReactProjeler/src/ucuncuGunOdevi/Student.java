package ucuncuGunOdevi;

public class Student extends User {
    private String education;
    private int age;
    public Student(){

    }

    public Student(String education, int age) {
        this.education = education;
        this.age = age;
    }

    public Student(int id, String email, String name, String password, String education, int age) {
        super(id, email, name, password);
        this.education = education;
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
