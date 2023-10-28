package com.vti.backend;

import com.vti.entity.User;
import utils.ScannerUtils;

public class Menu {
    public static void runProgram() {
        int option = 0;
        while (true) {
            System.out.println("+-------------------+------------------+");
            System.out.println("=====Lịch Vạn Niên==========\n" +
                    "=====1. Tạo Account==============\n" +
                    "=====2. Đăng Nhập=============\n" +
                    "=====3. Xem ngày hiện tại==========\n" +
                    "=====4. Xem thông tin chi tiết Account=====\n" +
                    "=====0. Quit=================================");
            System.out.println("+-------------------+------------------+");

            System.out.println("Mời nhập lựa chọn: ");
            option = ScannerUtils.inputNumber();
            ScannerUtils.inputString();

            switch (option) {
                case 1:
                    Function.register();
                    break;
                case 2:
                    Function.login();
                    break;
                case 3:
                    Function.getDate();
                    break;
                case 4:
                    Function.getAccountInfo();
                    break;
                case 0:
                    System.out.println("Chương trình đang đóng......");
                    return;
            }
        }
    }
}
