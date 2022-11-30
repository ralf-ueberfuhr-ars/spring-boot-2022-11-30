package de.sample.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TrainerConfiguration {

    //@Bean(name = "Julia")
//    @Primary // wenn kein @Qualifier
    Trainer createDefaultTrainer() {
        return new Trainer("Julia", "Banks");
    }

}
