package com.tobyspring.tobyspring.domain.user;

import org.junit.Test;

public class UserDaoTest {
    @Test
    public void connection주입() {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao dao = new UserDao(connectionMaker);
    }
}