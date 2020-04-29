package com.gabriel.zuulreka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ZuulrekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulrekaApplication.class, args);
	}

}
