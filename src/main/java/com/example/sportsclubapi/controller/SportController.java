package com.example.sportsclubapi.controller;

import com.example.sportsclubapi.model.Sport;
import com.example.sportsclubapi.repository.SportRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class SportController {

    private final SportRepository sportRepository;

    public SportController(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }

    @GetMapping("/sports")
    public List<Sport> getSports() {
        return sportRepository.findAll();
    }
    @PostMapping("/sports")
    public Sport addSport(@RequestBody Sport sport) {
        return sportRepository.save(sport);
    }
}