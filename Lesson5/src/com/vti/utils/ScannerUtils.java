package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
    public static Scanner initScanner()
    {
        return new Scanner(System.in);
    }

    public static String inputString(){
        return initScanner().nextLine();
    }

    public static int inputInt()
    {
        return initScanner().nextInt();
    }

    public static Float inputFloat()
    {
        return initScanner().nextFloat();
    }
}
