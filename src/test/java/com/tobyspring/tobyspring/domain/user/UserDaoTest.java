package com.tobyspring.tobyspring.domain.user;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDaoTest {
    @Test
    public void connection주입() {
        UserDao dao = new DaoFactory().userDao();
    }

    @Test
    public void daoFactoryTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);
    }
}