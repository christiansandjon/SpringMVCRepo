package com.smc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanlifecycle.xml");

        Coach coach = context.getBean("mycoach", Coach.class);

    }
}
