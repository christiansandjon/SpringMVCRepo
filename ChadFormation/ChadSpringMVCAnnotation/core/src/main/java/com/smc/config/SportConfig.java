package com.smc.config;

import com.smc.coach.Coach;
import com.smc.coach.SwimCoach;
import com.smc.service.FortuneService;
import com.smc.service.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.smc")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // define bean for sad service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

    // define bean for swim coach
}
