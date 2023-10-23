package com.vti.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AccountManagement {
    protected static List<Account> accountList = new ArrayList<>();

    public static void register(String username, String password) {

        Account account = new Account(username, password, false, false);
        account.setRegister(true);

        System.out.println("Đăng ký thành công");

        accountList.add(account);
    }

    public static void login(String username, String password) {
        for (Account account : accountList) {
            if (account.getRegister()) {
                if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                    System.out.println("Đăng nhập thành công");
                    account.setLogin(true);
                    break;
                } else {
                    System.out.println("Đăng nhập thất bại");
                }
            }
        }
    }

    public static void checkDateNow() {
        if (accountList.isEmpty()) {
            System.out.println("Bạn chưa đăng ký, vui lòng đăng ký để thực hiện");
        } else {
            for (Account account : accountList) {
                if (account.getLogin()) {
                    System.out.print("Ngày hiện tại là: ");
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDateTime now = LocalDateTime.now();
                    System.out.println(dtf.format(now));
                } else {
                    System.out.println("Bạn không xem được vì chưa đăng nhập");
                }
            }
        }
    }

    public static void convertCalendar() {
        if (accountList.isEmpty()) {
            System.out.println("Bạn chưa đăng ký, vui lòng đăng ký để thực hiện");
        } else {
            for (Account account : accountList) {
                if (account.getLogin()) {
                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate subDate = currentDate.minusMonths(1).minusDays(14);
                    System.out.println("Lịch âm hiện tại là: " + dtf.format(subDate));
                } else {
                    System.out.println("Bạn không xem được vì chưa đăng nhập");
                }
            }
        }
    }

    public static void printAccountDetail() {
        if (accountList.isEmpty()) {
            System.out.println("Bạn chưa đăng ký, vui lòng đăng ký để thực hiện");
        } else {
            System.out.println("Thông tin chi tiết Account");
            for (Account account : accountList) {
                if (account.getLogin()) {
                    System.out.println("+-------------------+------------------+");
                    System.out.println("Username là: " + account.getUsername());
                    System.out.println("Password là: " + account.getPassword());
                    System.out.println("Trạng thái đăng ký: " + account.getRegister());
                    System.out.println("Trạng thái đăng nhập: " + account.getLogin());
                    break;
                } else {
                    System.out.println("Bạn không xem được vì chưa đăng nhập");
                }
            }
        }
    }
}
