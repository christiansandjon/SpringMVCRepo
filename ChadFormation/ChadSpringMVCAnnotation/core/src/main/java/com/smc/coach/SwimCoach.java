package com.smc.coach;

import com.smc.coach.Coach;
import com.smc.service.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String sePresenter() {
        return "je suis coach de natation";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
