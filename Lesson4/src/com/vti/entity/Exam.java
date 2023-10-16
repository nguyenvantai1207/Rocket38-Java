package com.vti.entity;

import java.time.LocalDate;

public class Exam {
    private static int countExam = 1;
    private int id;
    private String code;
    private String title;
    private CategoryQuestion categoryId;
    private int duration;
    private Account creatorId;
    private LocalDate createDate;
    private Question[] questions;

    public Exam(String code, String title, CategoryQuestion categoryId, int duration, Account creatorId, LocalDate createDate) {
        this.id = countExam++;
        this.code = code;
        this.title = title;
        this.categoryId = categoryId;
        this.duration = duration;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryQuestion getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryQuestion categoryId) {
        this.categoryId = categoryId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Account getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Account creatorId) {
        this.creatorId = creatorId;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
