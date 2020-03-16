package com.feigntest.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-NAME")
public interface RemoteCallService {
    @RequestMapping(value = "/hi")
    String test(@RequestParam(value = "name") String name);
}
