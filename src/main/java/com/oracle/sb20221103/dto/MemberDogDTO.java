package com.oracle.sb20221103.dto;

import lombok.Data;

@Data
public class MemberDogDTO {
	private int 	id;				// ?��?��번호
	private String 	username;		// ?��?��?��?��?��
	private String 	role;			// 권한
	private String 	password;		// 비�?번호
	private Long	memberCall;		// ?��?���?
	private String	memberName;		// ?���?
	private String	memberAddress;	// 주소
	private String	memberEmail;	// ?��메일
	private String	profImg;		// ?��로필?���?
	private String	teacher;		// ?��?��?��?��?��
	private Long	memberDrop;		// ?��?��?���?
	private Long 	dogNo;  	 //반려견번?��
	private String 	dogName; 	 //반려견이�?
	private Long 	dogGender; 	 //반려견성�?
	private Long 	dogAge; 	 //반려견나?��
	private Long 	dogWeight; 	 //반려견몸무게
	private String 	dogMemo; 	 //?��?��?��?��
	private Long 	deSexibng; 	 //중성?��?���?
	private String 	dogKind; 	 //견종�?
	private Long 	joinCheck; 	 //?��치원�??��?��?��
	private String 	scStartdate; //?��치원?��?��?��
	private String 	scEnddate; 	 //?��치원종료?��
	
	
	
	
	//error 때문에..
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	

	
	
}
