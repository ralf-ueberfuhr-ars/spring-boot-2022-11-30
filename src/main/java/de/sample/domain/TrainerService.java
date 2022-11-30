package de.sample.domain;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TrainerService {

    @Setter
    private Trainer trainer;

    // Initialdaten konfigurierbar??

    public TrainerService(/*@Qualifier("Tom")*/ Trainer trainer) { // Trainer-Objekt im Kontext
        this.trainer = trainer;
    }

    public Optional<Trainer> getTrainer() {
        return Optional.ofNullable(trainer);
    }

}
