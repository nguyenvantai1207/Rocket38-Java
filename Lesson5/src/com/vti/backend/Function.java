package com.vti.backend;

import com.vti.entity.News;
import com.vti.entity.NewsManagement;
import com.vti.utils.ScannerUtils;

import java.util.ArrayList;

public class Function {
    public static void runMenu()
    {
        int option = 0;
        News news = null;
        NewsManagement nm = new NewsManagement();

        while(true)
        {

            System.out.println("Welcome to Program 'MyNews' ");
            System.out.println("Select a following these options: ");
            System.out.println("1. Insert News");
            System.out.println("2. View List News");
            System.out.println("3. Average Rate");
            System.out.println("0. Exit");

            option = ScannerUtils.inputInt();

            switch (option){
                case 1:
                    System.out.println("Enter a Id: ");
                    int id = ScannerUtils.inputInt();
                    System.out.println("Enter a Title");
                    String title = ScannerUtils.inputString();
                    System.out.println("Enter a Publish Date: ");
                    String publishDate = ScannerUtils.inputString();
                    System.out.println("Enter a Author: ");
                    String author = ScannerUtils.inputString();
                    System.out.println("Enter a Content");
                    String content = ScannerUtils.inputString();
                    System.out.println("Enter a rate1: ");
                    int rate1 = ScannerUtils.inputInt();
                    System.out.println("Enter a rate2: ");
                    int rate2 = ScannerUtils.inputInt();
                    System.out.println("Enter a rate3: ");
                    int rate3 = ScannerUtils.inputInt();

                    news = new News(id,title,publishDate,author,content,rate1,rate2,rate3);

                    nm.insertNews(news);
                    break;
                case 2:
                    System.out.println("List news are including: ");
                    nm.display();
                    break;
                case 3:
                    nm.calculate();
                    break;
                case 0:
                    System.out.println("Program is closing....");
                    return;
            }
        }
    }
}
