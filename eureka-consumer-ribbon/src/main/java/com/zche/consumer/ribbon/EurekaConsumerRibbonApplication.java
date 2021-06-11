package com.zche.consumer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
 * Description：服务消费者+ribbon负载均衡
 * Author：hezuchao
 * Date：2020/6/19 10:29
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}