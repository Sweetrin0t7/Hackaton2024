package com.example.hackaton.controller;

import com.example.hackaton.entity.Eventos;
import com.example.hackaton.entity.request.EventoRequest;
import com.example.hackaton.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    // Endpoint para criar um evento
    @PostMapping("/criar")
    public ResponseEntity<Eventos> criarEvento(@RequestBody EventoRequest eventoRequest) {
        Eventos evento = eventoService.criarEvento(eventoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(evento);
    }
}

