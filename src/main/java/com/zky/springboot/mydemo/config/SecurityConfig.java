package com.zky.springboot.mydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // 'HttpSecurity' Lambda DSL syntax
        http
            .authorizeHttpRequests(authz -> authz.requestMatchers("/**").permitAll())
            .csrf(csrf -> csrf.disable());  // Disable CSRF if necessary
        return http.build();
    }
}
