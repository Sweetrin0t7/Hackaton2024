package com.example.hackaton.repository;

import com.example.hackaton.entity.Prefeitura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrefeituraRepository extends JpaRepository<Prefeitura, Integer> {
}
