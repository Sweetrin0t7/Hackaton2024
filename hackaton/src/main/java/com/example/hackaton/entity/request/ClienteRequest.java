package com.example.hackaton.entity.request;

public class ClienteRequest {

    private String nome;
    private String telefone;
    private String email;
    private Boolean receberNotificacao;
    private Integer idLocalizacao;

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getReceberNotificacao() {
        return receberNotificacao;
    }

    public void setReceberNotificacao(Boolean receberNotificacao) {
        this.receberNotificacao = receberNotificacao;
    }

    public Integer getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Integer idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }
}
