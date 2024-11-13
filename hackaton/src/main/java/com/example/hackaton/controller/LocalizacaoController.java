package com.example.hackaton.controller;

import com.example.hackaton.entity.Localizacao;
import com.example.hackaton.entity.request.LocalizacaoRequest;
import com.example.hackaton.service.LocalizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/localizacoes")
public class LocalizacaoController {

    @Autowired
    private LocalizacaoService localizacaoService;

    @PostMapping("/criar")
    public ResponseEntity<Localizacao> criarLocalizacao(@RequestBody LocalizacaoRequest localizacaoRequest) {
        Localizacao localizacao = localizacaoService.criarLocalizacao(
                localizacaoRequest.getLatitude(),
                localizacaoRequest.getLongitude(),
                localizacaoRequest.getCidade(),
                localizacaoRequest.getBairro()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(localizacao);
    }
}

