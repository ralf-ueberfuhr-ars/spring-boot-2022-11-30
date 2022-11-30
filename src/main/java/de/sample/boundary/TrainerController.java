package de.sample.boundary;

import de.sample.domain.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/training/trainer")
@RequiredArgsConstructor
public class TrainerController {

    private final TrainerService service;
    private final TrainerDtoMapper mapper;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public TrainerDto getTrainer() {
        return service.getTrainer()
          .map(mapper::map)
          .orElseThrow(NotFoundException::new);
    }

}
