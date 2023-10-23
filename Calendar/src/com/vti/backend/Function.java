package com.vti.backend;

import com.vti.entity.AccountManagement;
import com.vti.utils.ScannerUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Function {
    public static void runProgram() {
        int option = 0;
        while (true) {
            System.out.println("+-------------------+------------------+");
            System.out.println("=====Lịch Vạn Niên==========\n" +
                    "=====1. Tạo Account==============\n" +
                    "=====2. Đăng Nhập=============\n" +
                    "=====3. Xem ngày hiện tại==========\n" +
                    "=====4. Đổi lịch dương sang lịch âm====\n" +
                    "=====5. Xem thông tin chi tiết Account=====\n" +
                    "=====0. Quit=================================");
            System.out.println("+-------------------+------------------+");

            System.out.println("Mời nhập lựa chọn: ");
            option = ScannerUtils.inputNumber();

            switch (option) {
                case 1:
                    System.out.println("Mời nhập username: ");
                    String username = ScannerUtils.inputString();
                    System.out.println("Mời nhập password: ");
                    String password = ScannerUtils.inputString();
                    AccountManagement.register(username, password);
                    break;
                case 2:
                    System.out.println("Mời nhập username: ");
                    username = ScannerUtils.inputString();
                    System.out.println("Mời nhập password: ");
                    password = ScannerUtils.inputString();
                    AccountManagement.login(username, password);
                    break;
                case 3:
                    AccountManagement.checkDateNow();
                    break;
                case 4:
                    AccountManagement.convertCalendar();
                    break;
                case 5:
                    AccountManagement.printAccountDetail();
                    break;
                case 0:
                    System.out.println("Chương trình đang đóng......");
                    return;
            }
        }
    }
}

