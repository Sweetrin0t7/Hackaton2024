    package com.example.hackaton.entity;

    import jakarta.persistence.*;

    @Entity
    public class Mei extends Usuarios {
        private String cnpj;
        private Boolean sofreuEnchente;
        private String sobreMim;

        @ManyToOne
        @JoinColumn(name = "id_localizacao")
        private Localizacao localizacao;

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
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

        public Localizacao getLocalizacao() {
            return localizacao;
        }

        public void setLocalizacao(Localizacao localizacao) {
            this.localizacao = localizacao;
        }
    }


