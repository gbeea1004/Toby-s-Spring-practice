package com.tobyspring.tobyspring;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/springbook?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    @Test
    public void 연결하기() throws Exception {
        try {
            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("JDBC 연결 성공");
            System.out.println(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
