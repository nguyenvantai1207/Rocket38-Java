package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private static int countGroup = 1;
    private int id;
    private String name;
    private Account creatorId;
    private LocalDate createDate;
    private Account[] accounts;

    public Group(String name, Account creatorId, LocalDate createDate, Account[] accounts) {
        this.id = countGroup++;
        this.name = name;
        this.creatorId = creatorId;
        this.createDate = createDate;
        this.accounts = accounts;
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

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creatorId=" + creatorId +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
