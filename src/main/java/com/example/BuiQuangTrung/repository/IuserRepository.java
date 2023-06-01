package com.example.BuiQuangTrung.repository;

import com.example.BuiQuangTrung.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IuserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.username =?1 ")
    User findByUsername(String username);
}
