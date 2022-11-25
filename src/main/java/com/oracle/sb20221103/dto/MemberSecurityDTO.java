package com.oracle.sb20221103.dto;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberSecurityDTO extends User {

	
	private String id;
	private String password;
	
	private String memberName;
	private String memberEmail;
	private Long memberDrop;
	private Long memberCall;
	private String profImg;
	private String teacher;
	
	public MemberSecurityDTO(String username, String password, String email,
			Long isDeleted, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		// TODO Auto-generated constructor stub
		this.id = username;
		this.password = password;
		this.memberEmail = email;
		this.memberDrop = isDeleted;
	}

//	public MemberSecurityDTO(String username, String password, String email, Long isDeleted,
//			List<SimpleGrantedAuthority> collect) {
//		// TODO Auto-generated constructor stub
//		super(username, password, collect);
//		this.id = username;
//		this.password = password;
//		this.memberEmail = email;
//		this.memberDrop = isDeleted;
//	}


	
}
