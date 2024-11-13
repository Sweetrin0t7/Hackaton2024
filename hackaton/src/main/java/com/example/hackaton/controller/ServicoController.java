package com.example.hackaton.controller;

import com.example.hackaton.entity.Servicos;
import com.example.hackaton.entity.request.ServicoRequest;
import com.example.hackaton.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    // Endpoint para criar um serviço
    @PostMapping("/criar")
    public ResponseEntity<Servicos> criarServico(@RequestBody ServicoRequest servicoRequest) {
        Servicos servico = servicoService.criarServico(servicoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(servico);
    }
}

