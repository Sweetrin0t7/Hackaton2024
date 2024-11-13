package com.example.hackaton.service;

import com.example.hackaton.entity.Eventos;
import com.example.hackaton.entity.Localizacao;
import com.example.hackaton.entity.Prefeitura;
import com.example.hackaton.entity.request.EventoRequest;
import com.example.hackaton.exceptions.ResourceNotFoundException;
import com.example.hackaton.repository.EventoRepository;
import com.example.hackaton.repository.LocalizacaoRepository;
import com.example.hackaton.repository.PrefeituraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private PrefeituraRepository prefeituraRepository;

    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    public Eventos criarEvento(EventoRequest eventoRequest) {
        // Buscar Prefeitura
        Prefeitura prefeitura = prefeituraRepository.findById(eventoRequest.getIdPrefeitura())
                .orElseThrow(() -> new ResourceNotFoundException("Prefeitura não encontrada"));

        // Buscar Localização
        Localizacao localizacao = localizacaoRepository.findById(eventoRequest.getIdLocalizacao())
                .orElseThrow(() -> new ResourceNotFoundException("Localização não encontrada"));

        // Criar e salvar evento
        Eventos evento = new Eventos();
        evento.setNome(eventoRequest.getNome());
        evento.setDescricao(eventoRequest.getDescricao());
        evento.setDataEvento(eventoRequest.getDataEvento());
        evento.setStatus(Eventos.StatusEvento.ATIVA);
        evento.setPrefeitura(prefeitura);
        evento.setLocalizacao(localizacao);

        return eventoRepository.save(evento);
    }
}
