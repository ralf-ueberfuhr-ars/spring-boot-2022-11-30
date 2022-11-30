package de.sample.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// this overwrites the values from application.yml
@Configuration
public class TrainerConfiguration {

    /*
     * - bean "julia" is @Primary
     * - to get Tom, add @Qualifier("tom") at injection point
    */

    @Primary
    @Bean
    Trainer julia() {
        return new Trainer("Julia", "Banks");
    }

    @Bean // (name = "Tom") overwrite the name of the bean
    Trainer tom() {
        return new Trainer("Tom", "Saywer");
    }

}
