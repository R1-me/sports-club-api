package com.example.sportsclubapi.repository;

import com.example.sportsclubapi.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepository extends JpaRepository<Sport, Long> {
}
