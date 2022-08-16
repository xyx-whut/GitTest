package com.tcl.git.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

    @RequestMapping("/user")
    public String sayHi(){
        return "HaHa...";
    }
}
