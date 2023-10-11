package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Account {
    private static int countAccount = 1;
    private int id;
    private String email;
    private String userName;
    private String fullName;
    private LocalDate createDate;
    private Department department;
    private Position position;
    private Group[] groups;

    public Account(String email, String userName, String fullName, LocalDate createDate, Department department, Position position, Group[] groups) {
        this.id = countAccount++;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.createDate = createDate;
        this.department = department;
        this.position = position;
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", createDate=" + createDate +
                ", department=" + department +
                ", position=" + position +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
