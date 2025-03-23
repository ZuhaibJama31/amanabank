package com.demo.amanabank.controller;

import com.demo.amanabank.model.User;

import com.demo.amanabank.services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/customers")
public class UserController {

    private UserServices userServices;

    @GetMapping("/home")
    public List<User> getAllUsers() {
        return userServices.getUsers();
    }

    @GetMapping("/{id}")
    public User getUsersById( @PathVariable Long id){
        return userServices.getUsersById(id);
    }


}
