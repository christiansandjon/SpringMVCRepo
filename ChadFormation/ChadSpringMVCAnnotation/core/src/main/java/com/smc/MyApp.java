package com.smc;

import com.smc.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static final String CONFIG = "beans.xml";

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(CONFIG);

        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.sePresenter());

        // call method to get daily fortune
        System.out.println(theCoach.getFortune());

        // close the context
        context.close();
    }

}
