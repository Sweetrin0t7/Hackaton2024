package com.example.hackaton.entity.request;

public class MeiRequest {
    private String cnpj;
    private Integer idLocalizacao;
    private Boolean sofreuEnchente;
    private String sobreMim; // Novo campo sobre_mim
    private String nome;  // Adicione o campo nome
    private String telefone;  // Adicione o campo telefone
    private String email;  // Adicione o campo email

    // Getters and Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Integer idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public Boolean getSofreuEnchente() {
        return sofreuEnchente;
    }

    public void setSofreuEnchente(Boolean sofreuEnchente) {
        this.sofreuEnchente = sofreuEnchente;
    }

    public String getSobreMim() {
        return sobreMim;
    }

    public void setSobreMim(String sobreMim) {
        this.sobreMim = sobreMim;
    }

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
}
