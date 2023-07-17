// WebSecurityConfigurerAdapter is deprecated
package com.example.erp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    // csrf() method has been deprecated
    http.csrf().ignoringRequestMatchers("/sample");
    return http.build();
  }
}
