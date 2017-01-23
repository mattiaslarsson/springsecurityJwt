package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1>Created by Mattias on 2017-01-12.</h1>
 */
@RestController
public class AppController {

    @RequestMapping("/")
    String hello() {
        return "Hello World!";
    }
}
