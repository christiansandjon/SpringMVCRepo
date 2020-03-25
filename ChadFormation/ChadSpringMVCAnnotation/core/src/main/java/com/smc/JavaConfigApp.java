package com.smc;

import com.smc.coach.Coach;
import com.smc.config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigApp {

    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach.sePresenter());
        System.out.println(theCoach.getFortune());

        // close context
        context.close();




    }
}
