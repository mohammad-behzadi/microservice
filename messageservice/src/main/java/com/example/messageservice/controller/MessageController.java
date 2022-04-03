package com.example.messageservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1")
public class MessageController {

    @GetMapping("message")
    public String getMessage(){
        return "Hello From messageservice ";
    }
}
