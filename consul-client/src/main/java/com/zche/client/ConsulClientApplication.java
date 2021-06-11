package com.zche.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
 * Description：consul-client作为服务提供方
 * @EnableDiscoveryClient注解用来将当前应用加入到服务治理体系中。
 * Author：hezuchao
 * Date：2020/6/18 20:27
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulClientApplication.class, args);
	}

}
