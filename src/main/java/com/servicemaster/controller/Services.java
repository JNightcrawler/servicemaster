package com.servicemaster.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Services
{
    @GetMapping("/getValue")
    public String getValue()
    {
        return "hello World";
    }
}
