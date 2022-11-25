package com.oracle.sb20221103.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.oracle.sb20221103.khj.domain.MemberRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@SequenceGenerator(name = "MEMBER_SEQ_GEN",               // 객체  SEQ
//sequenceName = "MEMBER_SEQ", // DB SEQ
//initialValue = 1,
//allocationSize =1 )
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "roleSet")
public class Member {

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,
//    generator = "MEMBER_SEQ_GEN")
	private String	 	id;				
	
	private String 	username;		
	private String 	password;
	
	private Long	memberCall;		
	private String	memberName;		
	private String	memberAddress;	
	private String	memberEmail;	
	private String	profImg;		
	private String	teacher;		
	private Long	memberDrop;	//탈퇴여부
	
	
	//권한 해시셋으로
	@ElementCollection(fetch = FetchType.LAZY)
	//hashSet 에도 빌더 사용하려고 쓰는 어노테이션
	@Builder.Default
	private Set<MemberRole> roleSet = new HashSet<>();
	
	//The field annotated with @Default must have an initializing expression;
	//that expression is taken as the default to be used if not explicitly set during building.
	
	public void addRole(MemberRole memberRole) {
		this.roleSet.add(memberRole);
	}
	
	public void clearRole(MemberRole memberRole) {
		this.roleSet.clear();
	}
	
	
}
