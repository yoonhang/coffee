package com.example.coffee.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CoffeeV1Dao {

	List<Map<String, String>> doCoffeeList();

    // List<Map<String, String>> doCoffeeList();

}