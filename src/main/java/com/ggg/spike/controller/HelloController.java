package com.ggg.spike.controller;

import com.ggg.spike.dao.MysqlRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private MysqlRepository repository;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(String name) {
        String result = repository.getResult(Integer.valueOf(name));
        return "Hello " + result;
    }
}
