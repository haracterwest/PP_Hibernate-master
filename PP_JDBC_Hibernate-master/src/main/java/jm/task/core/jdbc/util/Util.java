package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    public static final String URL = "jdbc:postgresql://localhost:5432/db";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "postgres";

    public static Connection getConnection() {
        Connection connection;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение с БД - OK!");
        } catch (SQLException e) {
            System.out.println("Соединение с БД - ERROR");
            throw new RuntimeException(e);
        }
        return connection;
    }
}
