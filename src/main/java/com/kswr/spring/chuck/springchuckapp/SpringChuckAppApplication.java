package com.kswr.spring.chuck.springchuckapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringChuckAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringChuckAppApplication.class, args);
    }

}

