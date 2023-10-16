package com.vti.frontend;

import com.vti.entity.Student;

public class Program1 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Kevin", "US");
        Student student2 = new Student(2, "David", "UK");
        Student student3 = new Student(3, "Lucy", "Korea");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        student1.setAverageScore(5.0);

        student1.addScore(3.0);

        System.out.println(student1);

        Student.printStudent(student1);
    }
}
