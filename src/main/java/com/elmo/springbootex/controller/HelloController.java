package com.elmo.springbootex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/getInfo")
    public String getinfo(String param){
        return "Hello World " + param;
    }


}
