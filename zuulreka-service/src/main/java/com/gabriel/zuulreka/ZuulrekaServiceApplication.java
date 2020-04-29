package com.gabriel.zuulreka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableEurekaClient
@SpringBootApplication
public class ZuulrekaServiceApplication {

	// @Autowired
	// @Lazy
	// private EurekaClient eurekaClient;

	public static void main(final String[] args) {
		SpringApplication.run(ZuulrekaServiceApplication.class, args);
	}

	public ZuulrekaServiceApplication(Environment e) {
		System.out.println("\n################\n");
		System.out.println("# SERVER_PORT=" + e.getProperty("server.port", e.getProperty("SERVER_PORT","-noServerPort-")));
		System.out.println("# EUREKA_URI=" + e.getProperty("EUREKA_URI", "-noURI-"));
		System.out.println("# EUREKA.serviceUrl=" + e.getProperty("eureka.client.serviceUrl.defaultZone", "-noEUREKA-"));
		System.out.println("\n################\n");
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().build();
	}
}
