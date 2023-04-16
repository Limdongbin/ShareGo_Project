package com.java501.S20230401.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public BCryptPasswordEncoder encodePwd() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//		http.authorizeRequests().anyRequest().permitAll();
//		return http.build();
		http.csrf().disable();
		http.authorizeRequests()
			 .antMatchers("/user/**").authenticated()
			 .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
			 .anyRequest().permitAll()
			 .and()
			 .formLogin()
			 .loginPage("/login")
			 .loginProcessingUrl("/loginProc")
			 .defaultSuccessUrl("/");
		return http.build();
	}
}
