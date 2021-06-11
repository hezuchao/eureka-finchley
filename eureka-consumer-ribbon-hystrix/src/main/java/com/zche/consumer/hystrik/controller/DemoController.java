package com.zche.consumer.hystrik.controller;

import com.zche.consumer.hystrik.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private ConsumerService consumerService;

    @GetMapping("consumer")
    public String first() {
        return consumerService.consumer();
    }
}
