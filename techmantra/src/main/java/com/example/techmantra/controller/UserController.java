package com.example.techmantra.controller;

import com.example.techmantra.entity.UserEntity;
import com.example.techmantra.repository.UserRepository;
import com.example.techmantra.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/add-user")
    public ResponseEntity<Response> addUser(@RequestBody UserEntity userEntity){
        userRepository.save(userEntity);
        Response response = new Response("Added", LocalDate.now());
        return new ResponseEntity<Response>(response,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/get-user", method = RequestMethod.GET)
    public Iterable getUser(){
        return userRepository.findAll();
    }
}
