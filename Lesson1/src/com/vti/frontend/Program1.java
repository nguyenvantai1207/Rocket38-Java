package com.vti.frontend;

import com.vti.backend.Lesson2;
import com.vti.entity.*;

import java.time.LocalDate;

public class Program1 {
    public static void main(String[] args) {
        Department department1 = new Department("Sales");
        Department department2 = new Department("Marketing");
        Department department3 = new Department("HR");
        Department department4 = new Department("Development");
        Department department5 = new Department("Finance");

        Position position1 = new Position(Position.Name.PM);
        Position position2 = new Position(Position.Name.DEV);
        Position position3 = new Position(Position.Name.TEST);
        Position position4 = new Position(Position.Name.SCRUM_MASTER);

        Group[] groups1 = new Group[0];
        Group[] groups2 = new Group[1];
        Group[] groups3 = new Group[2];
        Group[] groups4 = new Group[3];
        Group[] groups5 = new Group[5];

        Account[] accounts1 = new Account[0];
        Account[] accounts2 = new Account[1];
        Account[] accounts3 = new Account[2];
        Account[] accounts4 = new Account[4];
        Account[] accounts5 = new Account[5];


        Account account1 = new Account("user1@example.com", "user1", "John Doe", LocalDate.of(2023, 10, 1), department4, position1, groups1);
        Account account2 = new Account("user2@example.com", "user2", "Jane Smith", LocalDate.of(2023, 10, 2), department2, position4,groups2);
        Account account3 = new Account("user3@example.com", "user3", "Mary Johnson", LocalDate.of(2023, 10, 3), department1, position2,groups3);
        Account account4 = new Account("user4@example.com", "user4", "Mark Williams", LocalDate.of(2023, 10, 4), department3, position3,groups4);
        Account account5 = new Account("user5@example.com", "user5", "Robert Brown", LocalDate.of(2023, 10, 5), department5, position4,groups5);

        accounts1 = new Account[]{};
        accounts2 = new Account[]{account1};
        accounts3 = new Account[]{account1, account2};
        accounts4 = new Account[]{account1,account2,account3,account4};
        accounts5 = new Account[]{account1,account2,account3,account4,account5};


        Group group1 = new Group("Group A",account1,LocalDate.of(2023,10,2),accounts3);
        Group group2 = new Group("Group B",account2,LocalDate.of(2023,10,3),accounts2);
        Group group3 = new Group("Group C",account3,LocalDate.of(2023,10,4),accounts3);
        Group group4 = new Group("Group D",account4,LocalDate.of(2023,10,5),accounts4);
        Group group5 = new Group("Group E",account5,LocalDate.of(2023,10,6),accounts5);

        groups1 = new Group[]{};
        groups2 = new Group[]{group1};
        groups3 = new Group[]{group2, group4};
        groups4 = new Group[]{group1, group3, group5};
        groups5 = new Group[]{group1, group2, group3, group4, group5};


        TypeQuestion typeQuestion1 = new TypeQuestion(TypeQuestion.Name.ESSAY);
        TypeQuestion typeQuestion2 = new TypeQuestion(TypeQuestion.Name.MULTIPLE_CHOICE);

        CategoryQuestion categoryQuestion1 = new CategoryQuestion("Java");
        CategoryQuestion categoryQuestion2 = new CategoryQuestion(".NET");
        CategoryQuestion categoryQuestion3 = new CategoryQuestion("SQL");
        CategoryQuestion categoryQuestion4 = new CategoryQuestion("Postman");
        CategoryQuestion categoryQuestion5 = new CategoryQuestion("Ruby");
        CategoryQuestion categoryQuestion6 = new CategoryQuestion("JavaScript");

        Question question1 = new Question("What is a constructor in Java?", categoryQuestion1,typeQuestion1,account1,LocalDate.of(2023,10,1));
        Question question2 = new Question("Explain the concept of inheritance.", categoryQuestion1,typeQuestion1,account2,LocalDate.of(2023,10,2));
        Question question3 = new Question("How do you write a SELECT statement?", categoryQuestion3,typeQuestion2,account3,LocalDate.of(2023,10,3));
        Question question4 = new Question("What is the difference between POST and GET requests?", categoryQuestion4,typeQuestion2,account4,LocalDate.of(2023,10,4));
        Question question5 = new Question("Explain the use of the this keyword in Java.", categoryQuestion1,typeQuestion1,account5,LocalDate.of(2023,10,5));

        Answer answer1 = new Answer("A constructor is a special method in Java used to initialize objects.", question1,true);
        Answer answer2 = new Answer("Inheritance is a mechanism in Java where a new class inherits the properties and behaviors of an existing class.", question2,true);
        Answer answer3 = new Answer("A SELECT statement is used to retrieve data from a database table.", question3,true);
        Answer answer4 = new Answer("POST is used to submit data to be processed to a specified resource, while GET requests data from a specified resource.", question4,true);
        Answer answer5 = new Answer("The this keyword in Java refers to the current instance of a class and is used to access instance variables and methods.", question5,true);

        Exam exam1 = new Exam("EXAM001", "Java Basics Test", categoryQuestion1, 60, account1,LocalDate.of(2023,10,1));
        Exam exam2 = new Exam("EXAM002", "SQL Query Exam", categoryQuestion3, 45, account2,LocalDate.of(2023,10,2));
        Exam exam3 = new Exam("EXAM003", "JavaScript Test", categoryQuestion6, 75, account3,LocalDate.of(2023,10,3));
        Exam exam4 = new Exam("EXAM004", ".NET Programming Quiz", categoryQuestion2, 50, account4,LocalDate.of(2023,10,4));
        Exam exam5 = new Exam("EXAM005", "Ruby on Rails Exam", categoryQuestion5, 90, account5,LocalDate.of(2023,10,5));

        Lesson2 lesson2 = new Lesson2();
        lesson2.runLesson2_Question1(account2);

        lesson2.runLesson2_Question2(account2);

        lesson2.runLesson2_Question5(group1);

        lesson2.runLesson2_Question6(account2);

        lesson2.runLesson2_Question7(account1);
    }
}
