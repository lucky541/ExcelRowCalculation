package com.lucky.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucky.service.ResultDto;
import com.lucky.service.ServiceLocal;
 
@RestController
@RequestMapping(produces = "application/json")
public class HelloWorldController {
 
	@Autowired
	ServiceLocal service;
	
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello() {
        return "welcome";
    }
    
    @RequestMapping(value="/cal", method = RequestMethod.GET)
    public ResultDto test(@RequestParam(value = "s",required=true) String s) {
        ResultDto res =  service.getNum(s);
        return res;
    }
    
 
}