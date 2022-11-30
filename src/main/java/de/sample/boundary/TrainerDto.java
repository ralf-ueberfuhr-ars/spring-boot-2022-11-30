package de.sample.boundary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrainerDto {

    @JsonProperty("first")
    private String firstName;
    @JsonProperty("last")
    private String lastName;


}
