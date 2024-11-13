package com.example.hackaton.entity;

import jakarta.persistence.*;

@Entity
public class Links {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_mei")
    private Mei mei;

    private String link;

}

