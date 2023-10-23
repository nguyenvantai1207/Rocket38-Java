package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
    public static int countAccount = 1;
    public static Scanner scanner = new Scanner(System.in);
    public static String inputString() {
        return scanner.nextLine();
    }

    public static int inputNumber() {
        int number = 0;
        try {
            while (true) {
                number = Integer.parseInt(scanner.nextLine().trim());
                if (number < 0) {
                    System.out.println("Số không được âm! Mời nhập lại: ");
                    continue;
                }
                break;
            }
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
        return number;
    }

    public static void closeScanner()
    {
        scanner.close();
    }
}
