package com.ribbontest.controller;

import com.ribbontest.service.RibbonTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonTestController {
    @Autowired
    private RibbonTestService service;

    @RequestMapping("/ribbon/test")
    public String test(@RequestParam String name){
        return service.test(name);
    }
}
