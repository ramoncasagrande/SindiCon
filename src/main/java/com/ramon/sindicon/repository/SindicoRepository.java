package com.ramon.sindicon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramon.sindicon.model.Sindico;

public interface SindicoRepository extends JpaRepository<Sindico, Long> {
    
}
