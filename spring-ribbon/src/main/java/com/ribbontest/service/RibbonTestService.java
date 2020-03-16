package com.ribbontest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonTestService {
    @Autowired
    RestTemplate restTemplate;

    public String test(String name) {
        return restTemplate.getForObject("http://SERVICE-NAME/hi?name="+name, String.class);
    }
}
