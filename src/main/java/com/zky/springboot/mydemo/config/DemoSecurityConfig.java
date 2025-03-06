// package com.zky.springboot.mydemo.config;

// import javax.sql.DataSource;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.http.HttpMethod;
// import org.springframework.security.config.Customizer;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.provisioning.JdbcUserDetailsManager;
// import org.springframework.security.provisioning.UserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// public class DemoSecurityConfig {

//     // Add support for in-memory user
//     @Bean
//     public InMemoryUserDetailsManager userDetailsManager() {
//         UserDetails john = User.builder()
//                 .username("john")
//                 .password("{noop}test123")
//                 .roles("EMPLOYEE").build();
//         UserDetails mary = User.builder()
//                 .username("mary")
//                 .password("{noop}test123")
//                 .roles("EMPLOYEE", "MANAGER").build();
//         UserDetails susan = User.builder()
//                 .username("susan")
//                 .password("{noop}test123")
//                 .roles("EMPLOYEE", "MANAGER", "ADMIN").build();
//         return new InMemoryUserDetailsManager(john, mary, susan);
//     }

//     @Bean
//     public UserDetailsManager userDetailsManager(DataSource dataSource) {
//         return new JdbcUserDetailsManager(dataSource);
//     }

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//         // 'HttpSecurity' Lambda DSL syntax
//         http.authorizeHttpRequests(authz -> 
//                 authz
//                     .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE")
//                     .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
//                     .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
//                     .requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER")
//                     .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN"));

//         http.httpBasic(Customizer.withDefaults());  // Basic authentication
//         return http.build();
//     }
// }
