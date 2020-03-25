package com.smc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static final String CONFIG_LOCATION = "beans.xml";
    public static void main(String[] args) {

        // load context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        // retrieve
        Coach coach = context.getBean("baseBallcoach", Coach.class);
        Coach coach1 = context.getBean("coursecoach", Coach.class);
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);

        // call methods
        System.out.println(coach.monQuotidien());
        System.out.println(coach1.monQuotidien());
        System.out.println(coach.getFortune());
        System.out.println(coach1.getFortune());
        System.out.println(cricketCoach.monQuotidien());
        System.out.println(cricketCoach.getFortune());
        System.out.println(cricketCoach.getEmail());
        System.out.println(cricketCoach.getTeam());
        // close context
        context.close();
    }
}
