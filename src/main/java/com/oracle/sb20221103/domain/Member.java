package com.oracle.sb20221103.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
//@SequenceGenerator(name = "MEMBER_SEQ_GEN",               // 객체  SEQ
//sequenceName = "MEMBER_SEQ", // DB SEQ
//initialValue = 1,
//allocationSize =1 )
public class Member {

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,
//    generator = "MEMBER_SEQ_GEN")
	
	private int	 	id;				
	private String 	username;		
	private String 	role;			
	private String 	password;		
	private Long	memberCall;		
	private String	memberName;		
	private String	memberAddress;	
	private String	memberEmail;	
	private String	profImg;		
	private String	teacher;		
	private Long	memberDrop;	
}
