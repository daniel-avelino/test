package com.example.curso1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso1.entities.Products;

public interface ProductRepository extends JpaRepository<Products, Integer>{

}
