package com.example.messageservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message/{name}")
    public String getMessage(@PathVariable String name){
        return "message is="+name;
    }
}
