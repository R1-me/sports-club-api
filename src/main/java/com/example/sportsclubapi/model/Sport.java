package com.example.sportsclubapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sport")
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public Sport() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}