package com.ribbontest.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced // 开启负载均衡，默认是轮询的方式
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}