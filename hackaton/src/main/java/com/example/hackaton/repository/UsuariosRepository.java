package com.example.hackaton.repository;

import com.example.hackaton.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
}

