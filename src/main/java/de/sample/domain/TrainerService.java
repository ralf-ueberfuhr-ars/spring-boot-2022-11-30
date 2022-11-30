package de.sample.domain;

import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TrainerService {

    @Setter
    private Trainer trainer;

    /*
     * Configure trainer: Convention over Configuration
     * ----------------------------------------------------
     * Emilia Mayer (see TrainerPropertiesConfiguration and TrainerProperties default values)
     *  -> overwritten by application.yml (mapped to TrainerProperties)
     *  -> overwritten by custom Trainer bean (see TrainerConfiguration)
     */

    // Trainer instance must be available in context
    public TrainerService(Trainer trainer) {
        this.trainer = trainer;
    }

    public Optional<Trainer> getTrainer() {
        return Optional.ofNullable(trainer);
    }

}
