package com.example.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.web.AuthenticatedPrincipalOAuth2AuthorizedClientRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig{
	
	  @Bean public SecurityFilterChain filterChain(HttpSecurity http) throws  Exception { 
	   http.csrf().disable(); http.authorizeRequests()
	  .antMatchers("/user/**").authenticated()
	  .antMatchers("/manager/**").access("hasAnyRole('ROLE_MANAGER','ROLE_ADMIN')")
	  .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
	  .anyRequest().permitAll() 
	  .and() 
	  .formLogin() 
	  .loginPage("/loginform")
	  .loginProcessingUrl("/login") // 시큐리티 이용 로그인 진행 
	  .defaultSuccessUrl("/testing")
	  .and() 
	  .oauth2Login() 
	  .loginPage("/loginform")
	  .userInfoEndpoint();
	  
	  
	  
	  
	  return http.build(); }
	 
	
	

}
