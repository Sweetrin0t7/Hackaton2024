package com.example.hackaton.service;

import com.example.hackaton.entity.Mei;
import com.example.hackaton.entity.Servicos;
import com.example.hackaton.entity.request.ServicoRequest;
import com.example.hackaton.exceptions.ResourceNotFoundException;
import com.example.hackaton.repository.MeiRepository;
import com.example.hackaton.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    @Autowired
    private MeiRepository meiRepository;

    public Servicos criarServico(ServicoRequest servicoRequest) {
        // Buscar MEI
        Mei mei = meiRepository.findById(servicoRequest.getIdMei())
                .orElseThrow(() -> new ResourceNotFoundException("MEI não encontrado"));

        // Criar e salvar serviço
        Servicos servico = new Servicos();
        servico.setNome(servicoRequest.getNome());
        servico.setDescricao(servicoRequest.getDescricao());
        servico.setPreco(servicoRequest.getPreco());
        servico.setTempoMedio(servicoRequest.getTempoMedio());
        servico.setStatus(Servicos.StatusServico.ATIVO);  // Status default
        servico.setMei(mei);

        return servicoRepository.save(servico);
    }
}

