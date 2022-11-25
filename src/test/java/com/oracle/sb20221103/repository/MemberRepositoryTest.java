package com.oracle.sb20221103.repository;

import java.util.Optional;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.oracle.sb20221103.domain.Member;
import com.oracle.sb20221103.khj.domain.MemberRole;
import com.oracle.sb20221103.khj.repository.MemberRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Test
	public void insertMember() {
		IntStream.rangeClosed(1, 100).forEach(i ->{
			
			Member member = Member.builder()
							.id("member"+i)
							.password(passwordEncoder.encode("1111"))
							.memberEmail("email"+i+"@gmail.com")
							.build();
			
			member.addRole(MemberRole.MEMBER);
			
			if(i >= 90) {
				member.addRole(MemberRole.ADMIN);
			}
			memberRepository.save(member);
		});
	}
	
	@Test
	public void testRead() {
		Optional<Member> result = memberRepository.getWithRoles("member1");
		
		Member member = result.orElseThrow();
		System.out.println(member.toString());
		System.out.println(member.getRoleSet());
		
		member.getRoleSet().forEach(memberRole
									-> log.info(memberRole.name()));
		
	}
}
