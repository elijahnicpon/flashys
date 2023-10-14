package com.flashys.flashys_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlashysBackendApplication {

    public static void main(String[] args) {
        Class<?>[] runner = new Class<?>[]{FlashysBackendApplication.class, SeedRunner.class};
        SpringApplication.run(runner, args);
        System.out.println("\n-----✅ Application Setup Complete!-----");
    }

}
