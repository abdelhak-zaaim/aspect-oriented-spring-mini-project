package com.zaaim.aop;

import com.zaaim.aop.services.SampleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AspectOrientedSpringMiniProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AspectOrientedSpringMiniProjectApplication.class, args);
    }

    @Bean
    CommandLineRunner run(SampleService sampleService) {
        return args -> {
            System.out.println(sampleService.performTask());
        };
    }
}
