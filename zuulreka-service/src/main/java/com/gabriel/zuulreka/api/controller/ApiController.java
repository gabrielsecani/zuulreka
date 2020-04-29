package com.gabriel.zuulreka.api.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final Logger log = LoggerFactory.getLogger(ApiController.class.getName());
    
    private String data;

    ApiController(Environment env){
        try {
            this.data = "{'id': '"+ new Random().nextInt(99999999)+ "', 'PORT':'"+env.getProperty("server.port","-")+"', 'ip': '"+InetAddress.getLocalHost()+"'}";
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    @GetMapping()
    public String getLocalHost() {
        log.info(data);
        return data;
    }

}