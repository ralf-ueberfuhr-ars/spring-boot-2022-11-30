package de.sample.domain.properties;

import de.sample.domain.Trainer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class TrainerPropertiesConfiguration {

    private final TrainerProperties properties;

    // only, if no other bean is existent
    @Bean
    @ConditionalOnMissingBean(Trainer.class)
    Trainer createTrainerFromProperties() {
        return new Trainer(
          properties.getFirstName(),
          properties.getLastName()
        );
    }

}
