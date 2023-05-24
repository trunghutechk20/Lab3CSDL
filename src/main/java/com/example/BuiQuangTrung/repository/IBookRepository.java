package com.example.BuiQuangTrung.repository;


import com.example.BuiQuangTrung.entity.Book;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface IBookRepository extends JpaRepository <Book, Long >{
}
