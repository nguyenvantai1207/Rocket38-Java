package com.vti.entity;

import java.util.ArrayList;

public class News{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int rate1;
    private int rate2;
    private int rate3;
    private int[] rates = new int[3];


    public News(int id, String title, String publishDate, String author, String content, int rate1, int rate2, int rate3) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.rates[0] = rate1;
        this.rates[1] = rate2;
        this.rates[2] = rate3;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int[] getRates() {
        return rates;
    }

    public float calculateAverageRates()
    {

        if(getRates().length <= 3 && getRates().length > 0)
        {
            return  (float) (rates[0] + rates[1] + rates[2]) / 3;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", averageRate=" + averageRate +
                '}';
    }
}
