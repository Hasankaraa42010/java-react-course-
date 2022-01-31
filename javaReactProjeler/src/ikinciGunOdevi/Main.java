package ikinciGunOdevi;
/*
    Özellik nesnesi olarak tanımladığımızı düşündüğünüz iki örnek veriniz.
Bunlara ait class, contructor yapılarını oluşturup diziye ekleyip listeleyiniz.
İş sınıfı olarak tanımladığımızı düşündüğünüz bir class oluşturunuz. En az iki metot yazınız.
     */
public class Main {
public static void main(String[] args){
    Course course=new Course(2,"Java","Java react kursu");
    Course course2=new Course(1,"C#","c# angular kursu");
    Category category=new Category();
    CourseManager manager=new CourseManager();
    manager.add(course);
    manager.delete(course);
    Course[] courses={course,course2};
    for (Course coursess:courses
         ) {
        System.out.println(coursess.getName());

    }
}
}
