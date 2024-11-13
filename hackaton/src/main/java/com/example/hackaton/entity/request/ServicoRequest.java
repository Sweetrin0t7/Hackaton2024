package com.example.hackaton.entity.request;

import java.math.BigDecimal;

public class ServicoRequest {
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Integer tempoMedio;
    private Integer idMei;

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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(Integer tempoMedio) {
        this.tempoMedio = tempoMedio;
    }


    public Integer getIdMei() {
        return idMei;
    }

    public void setIdMei(Integer idMei) {
        this.idMei = idMei;
    }
}
