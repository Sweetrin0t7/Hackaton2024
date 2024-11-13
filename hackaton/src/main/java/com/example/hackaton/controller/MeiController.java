package com.example.hackaton.controller;

import com.example.hackaton.entity.Mei;
import com.example.hackaton.entity.request.MeiRequest;
import com.example.hackaton.service.MeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meis")
public class MeiController {

    @Autowired
    private MeiService meiService;

    // Endpoint para criar um MEI
    @PostMapping("/criar")
    public ResponseEntity<Mei> criarMei(@RequestBody MeiRequest meiRequest) {
        Mei mei = meiService.criarMei(meiRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(mei);
    }
}
