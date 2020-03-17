package com.feigntest.controller;

import com.feigntest.service.RemoteCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignTestController {
    @Autowired
    private RemoteCallService service;

    @RequestMapping("/feign/test")
    public String test(@RequestParam String name){
        return service.test(name);
    }
}