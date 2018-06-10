package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.so.Greeting;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name") String name) {
    	Map<String,String> employeeMap = getEmployeeId();
        return employeeMap.get(name);
    }
    
    private Map<String,String> getEmployeeId() {
    	Map<String,String> employeeMap = new HashMap<String,String>();
    	employeeMap.put("abc", "123");
    	employeeMap.put("def", "456");
    	employeeMap.put("ghi", "789");
    	employeeMap.put("kjl", "101");
    	employeeMap.put("xyz", "99");
    	
		return employeeMap;
    	
    }
}
