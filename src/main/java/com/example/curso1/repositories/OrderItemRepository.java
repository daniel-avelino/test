package com.example.curso1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso1.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
