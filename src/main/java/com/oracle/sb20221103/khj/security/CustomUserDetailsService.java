package com.oracle.sb20221103.khj.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service

public class CustomUserDetailsService implements UserDetailsService {
	
	
	private PasswordEncoder passwordEncoder;
	

	public CustomUserDetailsService(PasswordEncoder passwordEncoder) {
		
		this.passwordEncoder = passwordEncoder;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("loadUserByUsername: "+ username);
		

		  UserDetails userDetails = User.builder()
				.username("admin")
				.password(passwordEncoder.encode("1111"))//패스워드 인코딩
				.authorities("ROLE_ADMIN")
				.build();
		
	log.info("username: "+ username);
	log.info("password: ????");
//		userDetails = User.builder().username("user")
//				.password(passwordEncoder.encode("2222"))
//				.authorities("ROLE_USER")
//				.build();
		
		return userDetails;

	}

}
