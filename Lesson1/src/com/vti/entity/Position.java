package com.vti.entity;
public class Position {
    private static int countPosition = 1;
    private int id;
    private Name name;
    public enum Name{
        DEV,TEST,SCRUM_MASTER,PM
    }

    public Position(Name name) {
        this.id = countPosition++;
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
