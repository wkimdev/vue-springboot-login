package com.example.demo.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity // 사이트가 잠기게 된다.
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	// project 진행을 위한 인증 해제
	@Override
	public void configure(WebSecurity web) throws Exception
	{
		web.ignoring().antMatchers("/css/**", "/script/**", "image/**", "/fonts/**", "lib/**");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
			.antMatchers("/admin/**").hasRole("ADMIN")
			.antMatchers("/**").permitAll();
	}
	
}
