package com.example.hackaton.service;

import com.example.hackaton.entity.Clientes;
import com.example.hackaton.entity.Localizacao;
import com.example.hackaton.entity.request.ClienteRequest;
import com.example.hackaton.exceptions.ResourceNotFoundException;
import com.example.hackaton.repository.ClienteRepository;
import com.example.hackaton.repository.LocalizacaoRepository;
import com.example.hackaton.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    public Clientes criarCliente(ClienteRequest clienteRequest) {
        // Buscar Localização
        if(clienteRequest.getIdLocalizacao() != null){
            Localizacao localizacao = localizacaoRepository.findById(clienteRequest.getIdLocalizacao())
                    .orElseThrow(() -> new ResourceNotFoundException("Localização não encontrada"));

            Clientes cliente = new Clientes();
            cliente.setNome(clienteRequest.getNome());
            cliente.setTelefone(clienteRequest.getTelefone());
            cliente.setEmail(clienteRequest.getEmail());
            cliente.setDtCriacao(LocalDateTime.now());
            cliente.setLocalizacao(localizacao);
            cliente.setReceberNotificacao(clienteRequest.getReceberNotificacao());
            return clienteRepository.save(cliente);
        }else{
            Clientes cliente = new Clientes();
            cliente.setNome(clienteRequest.getNome());
            cliente.setTelefone(clienteRequest.getTelefone());
            cliente.setEmail(clienteRequest.getEmail());
            cliente.setDtCriacao(LocalDateTime.now());
            cliente.setReceberNotificacao(clienteRequest.getReceberNotificacao());
            return clienteRepository.save(cliente);
        }

    }
}

