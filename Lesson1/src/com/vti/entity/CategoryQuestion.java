package com.vti.entity;

public class CategoryQuestion {
    private static int countCategory = 1;
    private int id;
    private String name;

    public CategoryQuestion(String name) {
        this.id = countCategory++;
        this.name = name;
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
}
