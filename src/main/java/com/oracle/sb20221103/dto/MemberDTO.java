package com.oracle.sb20221103.dto;

import lombok.Data;

@Data
public class MemberDTO {
	private int	 	id;				// ?��?��번호
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
}
