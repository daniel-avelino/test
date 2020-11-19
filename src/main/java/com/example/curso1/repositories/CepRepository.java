package com.example.curso1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso1.config.Cep;

public interface CepRepository extends JpaRepository<Cep, Long> {

}
