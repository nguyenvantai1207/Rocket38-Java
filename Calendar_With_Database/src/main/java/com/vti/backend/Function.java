package com.vti.backend;

import com.vti.entity.User;
import utils.JdbcUtils;
import utils.ScannerUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Function {
    protected static User user = new User();

    public static void register() {
        try {

            String sql = "INSERT INTO `User`(username, password) VALUES (?,?)";
            PreparedStatement preparedStatement = JdbcUtils.getConnection().prepareStatement(sql);

            System.out.println("Enter a username: ");
            String username = ScannerUtils.inputString();

            if (hasUsernameExisted(username)) {
                System.out.println("Username already exists. Please choose a different username.");
                return; // Exit the registration process
            }

            System.out.println("Enter a password: ");
            String password = ScannerUtils.inputString();

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean hasUsernameExisted(String username) {
        int count = 0;
        try {
            String sql = "SELECT COUNT(*) FROM `User` WHERE username = ?";
            PreparedStatement preparedStatement = JdbcUtils.getConnection().prepareStatement(sql);

            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();
            count = resultSet.getInt(1);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return count > 0;
    }

    public static User login() {
        try {
            String sql = "SELECT * FROM `User` WHERE username = ? AND password = ?";
            PreparedStatement preparedStatement = JdbcUtils.getConnection().prepareStatement(sql);

            System.out.println("Enter a Username: ");
            String checkedUserName = ScannerUtils.inputString();
            System.out.println("Enter a Password: ");
            String checkedPassword = ScannerUtils.inputString();

            if (hasUsernameExisted(checkedUserName)) {
                if (validatePassword(checkedUserName, checkedPassword)) {
                    preparedStatement.setString(1, checkedUserName);
                    preparedStatement.setString(2, checkedPassword);

                    ResultSet resultSet = preparedStatement.executeQuery();

                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String userName = resultSet.getString("username");
                        String password = resultSet.getString("password");

                        user.setId(id);
                        user.setUsername(userName);
                        user.setPassword(password);
                    }
                    System.out.println("Login Successfully!");
                    return user;
                } else {
                    System.out.println("Wrong password.Login Failed!");
                }
            } else {
                System.out.println("Username is not existed!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Boolean validatePassword(String username, String password) {
        int count = 0;
        try {
            String sql = "SELECT COUNT(*) FROM `User` WHERE username = ? AND password = ?";
            PreparedStatement preparedStatement = JdbcUtils.getConnection().prepareStatement(sql);

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            count = resultSet.getInt(1);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return count > 0;
    }

    public static void getAccountInfo() {
        if (user.getUsername() != null && user.getPassword() != null) {
            System.out.println("User Id: " + user.getId());
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
            System.out.println("------------------------------");
        } else {
            System.out.println("Cannot execute function because user didn't login!");
        }
    }

    public static void getDate() {
        if (user.getUsername() != null && user.getPassword() != null) {
            {
                LocalDate currentDate = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                System.out.println("CurrentDate now is: " + currentDate.format(formatter));
            }
        } else {
            System.out.println("Cannot execute function because user didn't login!");
        }
    }
}