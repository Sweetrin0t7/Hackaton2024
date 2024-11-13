package com.example.hackaton.repository;

import com.example.hackaton.entity.Mei;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeiRepository extends JpaRepository<Mei, Integer> {
}
