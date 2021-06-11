package com.zche.consumer.feign.controller.mapping;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description：
 * Author：hezuchao
 * Date：2020/6/19 12:44
 */
@FeignClient("eureka-client")
public interface DemoClient {

    @GetMapping("dc")
    String consumer();
}
