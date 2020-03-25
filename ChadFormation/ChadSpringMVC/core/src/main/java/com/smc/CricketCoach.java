package com.smc;

public class CricketCoach implements Coach {

    private String email;
    private String team;
    private FortuneService fortuneService;

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService=fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    @Override
    public String monQuotidien() {
        return "je joue au cricket";
    }

    @Override
    public String getFortune() {
        return "richesse cricket coach "+fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    // add a init method
    public void initbean() {
        System.out.println("je commence la creation ");
    }

    // ad destroy method
    public void destroybean() {
        System.out.println("je commence la destruction ");
    }
}
