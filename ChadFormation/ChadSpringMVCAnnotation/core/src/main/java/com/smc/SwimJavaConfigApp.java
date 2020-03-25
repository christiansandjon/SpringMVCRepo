package com.smc;

import com.smc.coach.Coach;
import com.smc.coach.SwimCoach;
import com.smc.config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigApp {

    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(theCoach.sePresenter());
        System.out.println(theCoach.getFortune());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        // close context
        context.close();




    }
}
