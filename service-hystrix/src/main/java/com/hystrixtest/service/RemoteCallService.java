package com.hystrixtest.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-NAME", fallback = RemoteCallService.HystrixClientFallback.class)
public interface RemoteCallService {
    @RequestMapping(value = "/hi")
    String test(@RequestParam(value = "name") String name);

    @Component
    public static class HystrixClientFallback implements RemoteCallService{
        @Override
        public String test(@RequestParam(value = "name") String name) {
            return "sorry " + name + " SERVICE-NAME FALLBACK";
        }
    }

}
