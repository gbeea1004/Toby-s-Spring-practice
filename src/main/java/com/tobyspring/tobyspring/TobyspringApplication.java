package com.tobyspring.tobyspring;

import com.tobyspring.tobyspring.domain.user.DConnectionMaker;
import com.tobyspring.tobyspring.domain.user.User;
import com.tobyspring.tobyspring.domain.user.UserDao;

import java.sql.SQLException;

//@SpringBootApplication
public class TobyspringApplication {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        SpringApplication.run(TobyspringApplication.class, args);
        UserDao dao = new DConnectionMaker();
        User user = new User();
        user.setId("d");
        user.setName("하하");
        user.setPassword("123123");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println("이름 : " + user2.getName());
        System.out.println("패스워드 : " + user2.getPassword());

        System.out.println(user2.getId() + " 조회 성공");
    }

}
