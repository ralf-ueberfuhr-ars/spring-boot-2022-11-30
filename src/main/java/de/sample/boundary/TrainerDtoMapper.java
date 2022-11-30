package de.sample.boundary;

import de.sample.domain.Trainer;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface TrainerDtoMapper {

    TrainerDto map(Trainer source);

}
