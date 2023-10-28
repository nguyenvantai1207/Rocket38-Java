package utils;

import java.util.Scanner;

public class ScannerUtils {
    static Scanner scanner = new Scanner(System.in);

    public static String inputString()
    {
        return scanner.nextLine();
    }

    public static int inputNumber()
    {
        return scanner.nextInt();
    }
}
