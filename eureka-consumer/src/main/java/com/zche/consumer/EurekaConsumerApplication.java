package com.zche.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
 * Description：服务消费者
 * Author：hezuchao
 * Date：2020/6/18 21:08
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
