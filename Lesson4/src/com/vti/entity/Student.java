package com.vti.entity;

public class Student {
    private int id;
    private String name;
    private String homeTown;
    private double averageScore;

    public Student(int id, String name, String homeTown) {
        this.id = id;
        this.name = name;
        this.homeTown = homeTown;
        this.averageScore = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public double addScore(double amount) {
        return this.averageScore += amount;
    }

    public static void printStudent(Student student) {
        System.out.println("Tên sinh viên là: " + student.getName());

        System.out.print("Học lực của sinh viên là: ");

        if (student.getAverageScore() < 4.0) {
            System.out.println("Yếu");
        } else if (student.getAverageScore() < 6.0) {
            System.out.println("Trung bình");
        }else if (student.getAverageScore() < 8.0){
            System.out.println("Khá");
        }else {
            System.out.println("Giỏi");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
