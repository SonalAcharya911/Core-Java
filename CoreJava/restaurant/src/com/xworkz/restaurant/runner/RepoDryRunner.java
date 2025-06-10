package com.xworkz.restaurant.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RepoDryRunner {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String userName="root";
        String password="Sonal@7715";
        String url="jdbc:mysql://localhost:3306/airlines";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection(url,userName,password);
        System.out.println("Connection success: "+connection);
    }
}
