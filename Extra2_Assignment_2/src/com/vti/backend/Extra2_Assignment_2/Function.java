package com.vti.backend.Extra2_Assignment_2;

import com.vti.entity.Extra2_Assignment_2.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Function {
    public static void runProgram() {
        String[] firstName = {"Dinh", "Trieu", "Ngo", "Tran", "Lang", "Luong", "Hoang"};
        String[] middleName = {"Thanh", "Ha", "Hai", "Lo", "Hoang", "Hanh", "Nhung"};
        String[] lastName = {"Duong", "Duc", "Chi", "Bao", "Chung", "Giang", "Danh"};

        //Random Session
        //Random Name
        String[] fullName = new String[10];

        for (int i = 0; i < 10; i++) {
            fullName[i] = generateFullNames(firstName, middleName, lastName);
        }

        //Random ID
        int[] listId = generateId();

        //Random Date
        LocalDate startDate = LocalDate.of(1991, 2, 1); // Define a start date
        LocalDate endDate = LocalDate.of(1991, 12, 31);  // Define an end date

        LocalDate[] dateArray = new LocalDate[10];

        for (int i = 0; i < 10; i++) {
            dateArray[i] = generateDate(startDate, endDate);
        }

        //create random student
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < fullName.length; i++) {
            Student student = new Student(fullName[i], "SV" + listId[i], dateArray[i]);

            studentList.add(student);
        }

        //Print student
        System.out.println("Full Name               ID          Date");
        System.out.println("-----------------------------------------------");
        for (Student st : studentList) {
            String formattedString = String.format("%-20s\t%-10s\t%-15s",
                    st.getFullName(), st.getId(), st.getBirthday());
            System.out.println(formattedString);
        }

    }

    public static Random initRandom() {
        Random random = new Random();
        return random;
    }

    public static String generateFullNames(String[] firstName, String[] middleName, String[] lastName) {
        String fullName = "";
        int firstNameIndex = initRandom().nextInt(firstName.length);
        int middleNameIndex = initRandom().nextInt(middleName.length);
        int lastNameIndex = initRandom().nextInt(lastName.length);

        fullName = firstName[firstNameIndex] + " " + middleName[middleNameIndex] + " " + lastName[lastNameIndex];

        return fullName;
    }

    public static int[] generateId() {
        int[] idList = new int[10];
        int lowerBound = 1_000_000; // Smallest 7-digit number
        int upperBound = 10_000_000; // Largest 7-digit number

        for (int i = 0; i < idList.length; i++) {
            idList[i] = initRandom().nextInt(upperBound - lowerBound) + lowerBound;
        }
        return idList;
    }

    public static LocalDate generateDate(LocalDate startDate, LocalDate endDate) {
        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = endDate.toEpochDay();

        long randomEpochDay = startEpochDay + initRandom().nextInt((int) (endEpochDay - startEpochDay));

        return LocalDate.ofEpochDay(randomEpochDay);
    }
}
