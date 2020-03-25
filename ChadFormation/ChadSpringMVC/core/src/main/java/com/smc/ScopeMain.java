package com.smc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeMain {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("scope.xml");

        Coach alphacoach = context.getBean("mycoach",Coach.class);
        Coach betacoach = context.getBean("mycoach",Coach.class);

        // check if they are the same
        boolean result = (alphacoach == betacoach);
        if (result){
            System.out.println("yeah they are the same !");}

            else{
            System.out.println("no they don't");
        }
            System.out.println("memory location for alphacoach "+alphacoach);
            System.out.println("memory location for betacoach "+betacoach);
        }
}

