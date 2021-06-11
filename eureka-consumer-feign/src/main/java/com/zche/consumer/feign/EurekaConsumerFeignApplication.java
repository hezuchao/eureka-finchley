package com.zche.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 * Description：服务消费者(feign),包含负载均衡
 * Author：hezuchao
 * Date：2020/6/19 12:48
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerFeignApplication.class, args);
	}

}
