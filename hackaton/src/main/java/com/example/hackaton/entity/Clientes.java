package com.example.hackaton.entity;

import jakarta.persistence.*;

@Entity
public class Clientes extends Usuarios {
    @ManyToOne
    @JoinColumn(name = "id_localizacao")
    private Localizacao localizacao;

    private Boolean receberNotificacao;

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public Boolean getReceberNotificacao() {
        return receberNotificacao;
    }

    public void setReceberNotificacao(Boolean receberNotificacao) {
        this.receberNotificacao = receberNotificacao;
    }
}

