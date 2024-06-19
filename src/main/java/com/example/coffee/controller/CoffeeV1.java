package com.example.coffee.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.coffee.service.CoffeeV1Service;

@Controller
@RequestMapping("/v1")
public class CoffeeV1 {

    @Autowired
    CoffeeV1Service v1Service;


    @GetMapping("/coffee")
    public String doCoffee() {


        List<Map<String, String>> list = v1Service.doCoffeeList();

        System.out.println("list");
        
        return "/v1/coffee";

    }
}

