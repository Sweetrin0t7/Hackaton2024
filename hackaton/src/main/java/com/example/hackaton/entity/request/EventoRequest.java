package com.example.hackaton.entity.request;

import java.time.LocalDateTime;

public class EventoRequest {
    private String nome;
    private String descricao;
    private LocalDateTime dataEvento;
    private Integer idLocalizacao;
    private Integer idPrefeitura;

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

    public Integer getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Integer idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public Integer getIdPrefeitura() {
        return idPrefeitura;
    }

    public void setIdPrefeitura(Integer idPrefeitura) {
        this.idPrefeitura = idPrefeitura;
    }
}
