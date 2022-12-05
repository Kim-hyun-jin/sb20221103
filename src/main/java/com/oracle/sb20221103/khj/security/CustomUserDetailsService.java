package com.oracle.sb20221103.khj.security;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

import com.oracle.sb20221103.domain.Member;
import com.oracle.sb20221103.dto.MemberSecurityDTO;
import com.oracle.sb20221103.khj.repository.MemberRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
	
	private final MemberRepository memberRepository;
	
	private PasswordEncoder passwordEncoder;
	
	


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		System.out.println("loadUserByUsername: "+ username);
		

		  UserDetails admin = User.builder()
				.username("admin")
				//password(passwordEncoder.encode("1111"))
				.password("{noop}admin")//패스워드 인코딩
				.authorities("ROLE_ADMIN","ROLE_MEMBER")
				.build();
		  UserDetails user = User.builder()
				.username("user")
				//password(passwordEncoder.encode("1111"))
				.password("user")//패스워드 인코딩
				.authorities("ROLE_MEMBER")
				.build();
		  
//			UserDetails userDetails = User.builder().username("user")
//			.password(passwordEncoder.encode("2222"))
//			.authorities("ROLE_USER")
//			.build();
		  
		  
		  Optional<Member> result = memberRepository.getWithRoles(username);
		  
		  if(result.isEmpty()) {
			  throw new UsernameNotFoundException("username not found..");	  
		  }
		  
		  
//		  Member member = result.get();
//		  
//		  MemberSecurityDTO memberSecurityDTO= new MemberSecurityDTO(
//				 
//				  member.getId(), 
//				  member.getPassword(),
//				  member.getMemberEmail(), 
//				  member.getMemberDrop(),
//				  member.getRoleSet()
//				  		.stream().map(memberRole -> new SimpleGrantedAuthority("ROLE_"+memberRole.name()))
//				  		.collect(Collectors.toList()));
		  

		
		//return userDetails;
		//return memberSecurityDTO;
		  return (UserDetails) new InMemoryUserDetailsManager(user, admin);

	}

}
