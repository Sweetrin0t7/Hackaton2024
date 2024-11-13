package com.example.hackaton.service;

import com.example.hackaton.entity.Prefeitura;
import com.example.hackaton.repository.PrefeituraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrefeituraService {

    @Autowired
    private PrefeituraRepository prefeituraRepository;

    public Prefeitura criarPrefeitura(String nomePrefeitura) {
        Prefeitura prefeitura = new Prefeitura();
        prefeitura.setNomePrefeitura(nomePrefeitura);

        return prefeituraRepository.save(prefeitura);
    }
}
