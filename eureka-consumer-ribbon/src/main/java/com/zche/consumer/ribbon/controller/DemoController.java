package com.zche.consumer.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Description：
 * Author：hezuchao
 * Date：2020/6/18 17:04
 */
@RestController
public class DemoController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("consumer")
    public String first() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}
