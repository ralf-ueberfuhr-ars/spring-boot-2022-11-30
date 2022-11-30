package de.sample.domain.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("trainer") // read from application.yml
public class TrainerProperties {

    // default values, if not in application.yml
    private String firstName = "Emilia";
    private String lastName = "Mayer";

}
