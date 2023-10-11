package com.vti.entity;

public class TypeQuestion {
    private int countTypeQuestion = 1;
    private int id;
    private Name name;

    public enum Name{
        ESSAY, MULTIPLE_CHOICE
    }

    public TypeQuestion(Name name) {
        this.id = countTypeQuestion++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
