package com.example.hackaton.service;

import com.example.hackaton.entity.Localizacao;
import com.example.hackaton.entity.Mei;
import com.example.hackaton.entity.request.MeiRequest;
import com.example.hackaton.exceptions.ResourceNotFoundException;
import com.example.hackaton.repository.LocalizacaoRepository;
import com.example.hackaton.repository.MeiRepository;
import com.example.hackaton.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Timestamp;
import java.time.LocalDateTime;

@Service
public class MeiService {

    @Autowired
    private MeiRepository meiRepository;

    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    @Autowired
    private UsuariosRepository usuariosRepository;

    public Mei criarMei(MeiRequest meiRequest) {
        // Buscar Localização
        Localizacao localizacao = localizacaoRepository.findById(meiRequest.getIdLocalizacao())
                .orElseThrow(() -> new ResourceNotFoundException("Localização não encontrada"));

        Mei mei = new Mei();
        mei.setNome(meiRequest.getNome());  // Nome do MEI
        mei.setTelefone(meiRequest.getTelefone());  // Telefone
        mei.setEmail(meiRequest.getEmail());  // Email
        mei.setDtCriacao(LocalDateTime.now());
        mei.setCnpj(meiRequest.getCnpj());  // CNPJ
        mei.setSofreuEnchente(meiRequest.getSofreuEnchente());  // Status da enchente
        mei.setSobreMim(meiRequest.getSobreMim());  // Descrição do MEI
        mei.setLocalizacao(localizacao);

        return meiRepository.save(mei);
    }

}

