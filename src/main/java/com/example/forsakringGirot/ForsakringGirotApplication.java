package com.example.forsakringGirot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.forsakringGirot.repository")

@ComponentScan("com")
public class ForsakringGirotApplication {
	public static void main(String[] args) {
		SpringApplication.run(ForsakringGirotApplication.class, args);
	}
}