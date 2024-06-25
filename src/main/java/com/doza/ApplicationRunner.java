package com.doza;

import com.doza.util.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(classPathXmlApplicationContext.getBean("connection_pool_1", ConnectionPool.class));
    }
}