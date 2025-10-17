package com.klef.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootbackendApplication extends SpringBootServletInitializer {
    
    @Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootbackendApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootbackendApplication.class, args);
        System.out.println("Project Backend is Running Successfully ....");
    }
}
