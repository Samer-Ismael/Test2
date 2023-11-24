package com.Aram.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Aram.models.User;
import com.Aram.dto.LoginDTO;
import com.Aram.dto.RegisterDTO;
import com.Aram.services.AuthService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private AuthService authenticationService;

    @PostMapping("/register")
    public User registerUser(@RequestBody RegisterDTO body){
        return authenticationService.registerUser(body.getUsername(), body.getPassword());
    }
    
    @PostMapping("/login")
    public LoginDTO loginUser(@RequestBody RegisterDTO body){
        return authenticationService.loginUser(body.getUsername(), body.getPassword());
    }
}   
