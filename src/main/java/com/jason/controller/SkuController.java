package com.jason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jasoncc on 26/07/17.
 */
@Controller
public class SkuController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
