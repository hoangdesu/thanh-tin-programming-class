package Lab.Dec25_Lab10_28_Deans_list;

import java.util.ArrayList;

public class LabProgram {
    public static void main(String[] args) {
        Course course = new Course();
        ArrayList<Student> deanList = new ArrayList<Student>();

        // Example students for testing
        course.addStudent(new Student("Henry", "Nguyen", 3.5));
        course.addStudent(new Student("Brenda", "Stern", 2.0));
        course.addStudent(new Student("Lynda", "Robison", 3.2));
        course.addStudent(new Student("Sonya", "King", 3.9));

        deanList = course.getDeansList();
        System.out.println("Dean's list:");
        for (Student student : deanList) {
            System.out.println(student);
        }

        Student tin = new Student("Tin", "Do", 3.9);

        System.out.println(tin.getFullName());
    }
}