package com.example.demo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int securityID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date purchaseDate;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioID", nullable = false)
    private Portfolio portfolio;

    // Constructors, Getters, and Setters
}

