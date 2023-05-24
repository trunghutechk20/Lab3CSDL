package com.example.BuiQuangTrung.repository;

import com.example.BuiQuangTrung.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICategoryRepository extends JpaRepository<Category , Long> {
}
