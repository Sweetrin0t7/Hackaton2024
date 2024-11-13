package com.example.hackaton.service;

import com.example.hackaton.entity.Localizacao;
import com.example.hackaton.repository.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class LocalizacaoService {

    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    public Localizacao criarLocalizacao(BigDecimal latitude, BigDecimal longitude, String cidade, String bairro) {
        Localizacao localizacao = new Localizacao();
        localizacao.setLatitude(latitude);
        localizacao.setLongitude(longitude);
        localizacao.setCidade(cidade);
        localizacao.setBairro(bairro);

        return localizacaoRepository.save(localizacao);
    }
}


