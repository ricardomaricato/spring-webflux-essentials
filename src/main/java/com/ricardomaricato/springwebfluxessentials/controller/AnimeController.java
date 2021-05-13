package com.ricardomaricato.springwebfluxessentials.controller;

import com.ricardomaricato.springwebfluxessentials.domain.Anime;
import com.ricardomaricato.springwebfluxessentials.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/animes")
@Slf4j
@RequiredArgsConstructor
public class AnimeController {

    private final AnimeRepository animeRepository;

    @GetMapping
    public Flux<Anime> listAll(){
        return animeRepository.findAll();
    }
}
