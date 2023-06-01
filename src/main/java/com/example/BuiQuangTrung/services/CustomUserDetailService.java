package com.example.BuiQuangTrung.services;

import com.example.BuiQuangTrung.entity.CustomUserDetail;
import com.example.BuiQuangTrung.entity.User;
import com.example.BuiQuangTrung.repository.IuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private IuserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = userRepository.findByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("User not found");
        return new  CustomUserDetail(user, userRepository);
    }
}
