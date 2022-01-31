package ikinciGunOdevi;

import java.util.List;

public class CourseManager {
    public void add(Course course){
        System.out.println("Kurs eklendi:"+course.getName());
    }
    public void delete(Course course){
        System.out.println("Kurs silindi:"+course.getName());
    }

}
