package com.example.taskHeroku.repositories;

import com.example.taskHeroku.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
