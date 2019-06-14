package com.zerovr.test;


import com.zerovr.Dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

    @Test
    public void testDemo1(){
        ApplicationContext app =new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("UserDao");
        userDao.save();
    }
}
