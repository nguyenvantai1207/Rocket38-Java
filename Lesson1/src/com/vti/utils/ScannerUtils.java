package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
    public  static int countDepartment = 1;
    public static Scanner initScanner()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static String inputString()
    {
        initScanner();
        String str = initScanner().nextLine();
        return str;
    }


}
