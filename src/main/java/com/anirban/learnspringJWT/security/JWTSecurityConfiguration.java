package com.anirban.learnspringJWT.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.anirban.learnspringJWT.jwtsecurity.JWTAuthenticationEntrypoint;
import com.anirban.learnspringJWT.jwtsecurity.JWTAuthenticationFilter;

@Configuration
public class JWTSecurityConfiguration {
	
	@Autowired
	JWTAuthenticationEntrypoint entryPoint;
	
	@Autowired
	JWTAuthenticationFilter authenticationFilter;
	
	@Bean
	public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
		
		 http.csrf(csrf -> csrf.disable())
				   .cors(cors -> cors.disable())
				   .authorizeHttpRequests(auth -> auth.requestMatchers("/auth/login").permitAll().anyRequest().authenticated())
				   .authorizeHttpRequests(auth -> auth.requestMatchers("/home/**").authenticated())
				   .exceptionHandling(ex -> ex.authenticationEntryPoint(entryPoint))
				   .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		 
		 http.addFilterBefore(authenticationFilter,UsernamePasswordAuthenticationFilter.class);
				   
		
		return http.build();		   
	} 
	

}
