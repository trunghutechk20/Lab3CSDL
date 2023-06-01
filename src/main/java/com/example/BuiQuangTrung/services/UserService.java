package com.example.BuiQuangTrung.services;

import com.example.BuiQuangTrung.entity.User;
import com.example.BuiQuangTrung.repository.IuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IuserRepository userRepository;
    public void save(User user){
        userRepository.save(user);
    }
}
