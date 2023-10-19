package com.vti.entity;

import java.util.ArrayList;
import java.util.List;

public class NewsManagement implements INews {
    private List<News> newsList = new ArrayList<>();

    public NewsManagement() {
    }

    public void insertNews(News news) {
        newsList.add(news);
    }

    @Override
    public void display() {
        for (News news : newsList) {
            System.out.println(news);
        }
    }

    @Override
    public float calculate() {
        if (!newsList.isEmpty()) {
            for (News news : newsList) {
                System.out.println("Average Rate for News ID " + news.getId() + ": " + news.calculateAverageRates());
            }
        }
        return 0;
    }
}
