package com.demo.amanabank.services;

import com.demo.amanabank.model.User;
import com.demo.amanabank.repository.UserRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServices {
    private UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();

    }

    public User getUsersById(Long id){
        return userRepository.findById(id) .orElse(null);
    }
}
