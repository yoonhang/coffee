package com.example.coffee.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coffee.dao.CoffeeV1Dao;

@Service
public class CoffeeV1Service {

    @Autowired
    CoffeeV1Dao v1Dao;

    public List<Map<String, String>> doCoffeeList() {
        List<Map<String, String>> list = v1Dao.doCoffeeList();

        // System.out.println("list");

        return list;
    }
    
}