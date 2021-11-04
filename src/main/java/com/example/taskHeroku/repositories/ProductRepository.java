package com.example.taskHeroku.repositories;

import com.example.taskHeroku.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
