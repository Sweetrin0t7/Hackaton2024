package com.example.hackaton.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private LocalDateTime dataEvento;

    @ManyToOne
    @JoinColumn(name = "id_localizacao")
    private Localizacao localizacao;

    @ManyToOne
    @JoinColumn(name = "id_prefeitura")
    private Prefeitura prefeitura;

    @Enumerated(EnumType.STRING)
    private StatusEvento status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDateTime dataEvento) {
        this.dataEvento = dataEvento;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public Prefeitura getPrefeitura() {
        return prefeitura;
    }

    public void setPrefeitura(Prefeitura prefeitura) {
        this.prefeitura = prefeitura;
    }

    public StatusEvento getStatus() {
        return status;
    }

    public void setStatus(StatusEvento status) {
        this.status = status;
    }

    public enum StatusEvento {
        ATIVA, ENCERRADA
    }

}
