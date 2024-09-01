package com.example.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int portfolioID;

    @OneToOne
    @JoinColumn(name = "clientID", nullable = false)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Security> securities;

    // Constructors, Getters, and Setters
}

