package com.smc.coach;


import com.smc.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    @Override
    public String sePresenter() {
        return "je suis coach de Tennis";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void enConstruction(){
        System.out.println("le bean est créé");
    }

    @PreDestroy
    public void enDestruction() {
        System.out.println("le bean est detruit");
    }
}
