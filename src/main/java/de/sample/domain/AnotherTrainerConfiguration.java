package de.sample.domain;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherTrainerConfiguration {

    @Bean(name = "Tom")
    @ConditionalOnMissingBean(Trainer.class)
    @ConfigurationProperties("trainer")
    Trainer createAnotherDefaultTrainer() {
        return new Trainer();
    }

}
