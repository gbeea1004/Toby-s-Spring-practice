package com.tobyspring.tobyspring.domain.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/springbook?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf8", "root", "1234");
    }
}
