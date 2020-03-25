package com.smc;

public class CourseCoach implements Coach {

    // field for dependency injection
    private FortuneService fortuneService;

    // constructor for dependency injection
    public CourseCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
    }

    @Override
    public String monQuotidien() {
        return "je fais la course chaque matin";
    }

    @Override
    public String getFortune() {
        return "richesse du coach de course "+fortuneService.getFortune();
    }
}
