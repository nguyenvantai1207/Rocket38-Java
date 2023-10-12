package com.vti.entity.Extra2_Assignment_2;

import java.time.LocalDate;

public class Student {
    private String id;
    private String fullName;
    private LocalDate birthday;

    public Student(String fullName,String id, LocalDate birthday) {
        this.fullName = fullName;
        this.id = id;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
