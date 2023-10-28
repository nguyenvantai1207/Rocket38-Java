package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    static Connection connection = null;

    public static void main(String[] args) {
        JdbcUtils.getConnection();
    }

    public static Connection getConnection() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/main/resources/db.properties"));

            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driver = properties.getProperty("driverName");

            Class.forName(driver);

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Connection Success!");
            } else {
                System.out.println("Connection fail!");
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }

}
