package com.example.BuiQuangTrung.repository;


import com.example.BuiQuangTrung.entity.Book;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository <Book, Long >{
//    List<Book> searchBooks(String lowerCase);
}
