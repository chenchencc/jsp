package com.jason.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jasoncc on 26/07/17.
 */
@RestController
public class TestController {

    @RequestMapping("/demo")
    public String demo(){
        return "demo";
    }
}
