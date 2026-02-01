package com.example.sportsclubapi.controller;

import com.example.sportsclubapi.model.Sport;
import com.example.sportsclubapi.repository.SportRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sports")
public class SportController {

    private final SportRepository sportRepository;

    public SportController(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }

    @GetMapping
    public List<Sport> getAllSports() {
        return sportRepository.findAll();
    }

    @GetMapping("/{id}")
    public Sport getSportById(@PathVariable Long id) {
        return sportRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Sport createSport(@RequestBody Sport sport) {
        return sportRepository.save(sport);
    }

    @PutMapping("/{id}")
    public Sport updateSport(@PathVariable Long id, @RequestBody Sport sport) {
        sport.setId(id);
        return sportRepository.save(sport);
    }

    @DeleteMapping("/{id}")
    public void deleteSport(@PathVariable Long id) {
        sportRepository.deleteById(id);
    }
}