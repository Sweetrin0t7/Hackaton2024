package com.example.hackaton.repository;

import com.example.hackaton.entity.Eventos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Eventos, Long> {}

