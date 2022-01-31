package ucuncuGunOdevi;
/*
Kodlama.io projesini yazdığınızı düşünelim.

User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)

UserManager, InstructorManager, StudentManager için sistemde olabilecek operasyonları tahminleyip modelleyiniz. (Class-Inheritance-Method)

Kural -- Sadece gördüğümüz konulardan yararlanmalısınız.

Github adresinizi paylaşınız.
 */
public class Main {
    public static void main(String[] args) {
        Instructor instructor=new Instructor();
        instructor.setName("Engin demiroğ");
        Student student=new Student();
        student.setName("Hasan kara");
        InstructorManager manager=new InstructorManager();
        manager.addEducation(instructor);
        manager.comment(instructor,"Odevler sisteme yuklendi");
        StudentManager manager1=new StudentManager();
        manager1.comment(student,"Odevi yaptım github adresine yolladım hocam");
        manager1.finishEducation(student);

    }
}
