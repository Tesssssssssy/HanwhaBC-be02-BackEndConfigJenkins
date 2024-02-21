package com.example.campingontopconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableConfigServer
@SpringBootApplication
public class CampingOnTopConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampingOnTopConfigApplication.class, args);
    }

}
