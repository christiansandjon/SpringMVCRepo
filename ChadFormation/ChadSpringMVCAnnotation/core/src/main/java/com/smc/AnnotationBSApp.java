package com.smc;

import com.smc.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBSApp {

    public static final String CONFIG = "beans.xml";

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(CONFIG);

        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach betaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (theCoach == betaCoach);

        System.out.println("meme objet ? "+ result);
        System.out.println("thecoach "+ theCoach);
        System.out.println("betcoach "+ betaCoach);

        context.close();




    }
}
