package com.example.feedbackWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.feedbackWeb", "controller", "repository", "model"})
@EntityScan(basePackages = {"model"})
@EnableJpaRepositories(basePackages = {"com.example.feedbackWeb", "repository"})
public class FeedbackWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeedbackWebApplication.class, args);
    }

}