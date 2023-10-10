package vti.com.frontend;

import vti.com.entity.Gender;
import vti.com.entity.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("David",23, Gender.MALE,"USA", Student.Level.COLLEGE, Student.TrainingTime.FOUR_YEARS, Student.SoTinChi.VALUE1);
        Student student2 = new Student("Thomas",20, Gender.MALE,"England", Student.Level.UNIVERSITY, Student.TrainingTime.THREE_YEARS, Student.SoTinChi.VALUE2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext())
        {
            Student student = iterator.next();
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getGender().getDescription());
            System.out.println(student.getHometown());
            System.out.println(student.getLevel());
            System.out.println(student.getTrainingTime().getDescription());
            System.out.println(student.getSoTinChi().getValue());
            System.out.println("--------------------------");
        }
        
    }
}
