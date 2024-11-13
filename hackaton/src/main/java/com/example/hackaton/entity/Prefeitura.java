package com.example.hackaton.entity;

import jakarta.persistence.Entity;

@Entity
public class Prefeitura extends Usuarios {
    private String nomePrefeitura;

    public String getNomePrefeitura() {
        return nomePrefeitura;
    }

    public void setNomePrefeitura(String nomePrefeitura) {
        this.nomePrefeitura = nomePrefeitura;
    }
}

