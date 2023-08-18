package com.example.forsakringGirot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/chilifruits")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET",  "OPTIONS");
        registry.addMapping("/api/chilifruits/{id}")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET",  "OPTIONS");
        registry.addMapping("/api/chilifruits/{id}/updateQuantity")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("POST",  "OPTIONS");
    }
}