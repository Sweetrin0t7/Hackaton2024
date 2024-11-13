package com.example.hackaton.controller;

import com.example.hackaton.entity.Clientes;
import com.example.hackaton.entity.request.ClienteRequest;
import com.example.hackaton.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Clientes> criarCliente(@RequestBody ClienteRequest clienteRequest) {
        Clientes cliente = clienteService.criarCliente(clienteRequest);
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }
}
