package com.smc;

public class BaseBallCoach implements Coach {

    // field for dependency injection
    private FortuneService fortuneService;

    // constructor for dependency injection
    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String monQuotidien() {
        return "je joue au baseball";
    }

    @Override
    public String getFortune() {
        return "richesse du coach baseball "+fortuneService.getFortune();
    }
}
