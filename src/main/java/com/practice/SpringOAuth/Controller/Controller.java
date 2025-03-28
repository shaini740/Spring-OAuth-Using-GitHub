package com.practice.SpringOAuth.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {


    @GetMapping
    public String getMessage(){
        return "Spring OAuth using GitHub is set Successfully";
    }
}
