package com.jason.controller;

import com.jason.domain.Sku;
import com.jason.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jasoncc on 26/07/17.
 */
@RestController
public class Sku1Controller {


    @Autowired
    SkuService skuService;

    @RequestMapping("/all")
    public List<Sku> getAll(){
        return skuService.getAll();
    }
}
