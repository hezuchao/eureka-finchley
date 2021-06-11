package com.zche.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：
 * Author：hezuchao
 * Date：2020/6/18 17:04
 */
@RestController
public class DemoController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("dc")
    public String first() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
