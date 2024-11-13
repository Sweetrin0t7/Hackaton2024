package com.example.hackaton.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Servicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_mei")
    private Mei mei;

    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Integer tempoMedio;

    @Enumerated(EnumType.STRING)
    private StatusServico status; // Enum para 'ativo', 'inativo'

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mei getMei() {
        return mei;
    }

    public void setMei(Mei mei) {
        this.mei = mei;
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

    public StatusServico getStatus() {
        return status;
    }

    public void setStatus(StatusServico status) {
        this.status = status;
    }

    public enum StatusServico {
        ATIVO, INATIVO
    }

}

