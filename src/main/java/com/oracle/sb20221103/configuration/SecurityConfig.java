package com.oracle.sb20221103.configuration;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.oracle.sb20221103.khj.security.Custom403Handler;
import com.oracle.sb20221103.khj.security.CustomLoginSuccessHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig {

	@Bean
	public BCryptPasswordEncoder encodePwd() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) 
			throws Exception {
		
		http.formLogin().loginPage("/main/login");
		
		http.csrf().disable();
//		http.authorizeRequests()
//			.anyRequest()
//			.permitAll();
//		http.authorizeHttpRequests()
//			.antMatchers("/").permitAll() 어노테이션으로 관련 설정 추가
//			.antMatchers("/school/dogNotice/main")
//			.access(manager);
		http.logout()
			//.logoutUrl("/customLogout")
			.invalidateHttpSession(true)
			.deleteCookies("JSESSIONID", "remember-me");
		return http.build();
	}
	
	//정적자원에는 필터적용하지 않게 처리
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		
		System.out.println("---------web configure");
		
		return (web) -> web.ignoring().requestMatchers(
											PathRequest.toStaticResources().atCommonLocations());
	}
	
	//@Bean CustomLoginSuccessHandler 빈으로 등록
	@Bean
	public AuthenticationSuccessHandler successHandler() {
		return new CustomLoginSuccessHandler();
	}
	
	@Bean
	public AccessDeniedHandler accessDeniedHandler() {
		return new Custom403Handler();
	}
	
	

}
