package com.oracle.sb20221103.dto;

import lombok.Data;

@Data
public class Member {
	private int	 	id;				// ??λ²νΈ
	private String 	username;		// ????΄?
	private String 	role;			// κΆν
	private String 	password;		// λΉλ?λ²νΈ
	private Long	memberCall;		// ?°?½μ²?
	private String	memberName;		// ?΄λ¦?
	private String	memberAddress;	// μ£Όμ
	private String	memberEmail;	// ?΄λ©μΌ
	private String	profImg;		// ?λ‘ν?¬μ§?
	private String	teacher;		// ?΄?Ή? ??
	private Long	memberDrop;		// ??΄?¬λΆ?
}
