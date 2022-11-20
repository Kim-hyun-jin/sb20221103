package com.oracle.sb20221103.dto;

import lombok.Data;

@Data
public class Member {
	private int	 	id;				// ?šŒ?›ë²ˆí˜¸
	private String 	username;		// ?šŒ?›?•„?´?””
	private String 	role;			// ê¶Œí•œ
	private String 	password;		// ë¹„ë?ë²ˆí˜¸
	private Long	memberCall;		// ?—°?½ì²?
	private String	memberName;		// ?´ë¦?
	private String	memberAddress;	// ì£¼ì†Œ
	private String	memberEmail;	// ?´ë©”ì¼
	private String	profImg;		// ?”„ë¡œí•„?‚¬ì§?
	private String	teacher;		// ?‹´?‹¹?„ ?ƒ?‹˜
	private Long	memberDrop;		// ?ƒˆ?‡´?—¬ë¶?
}
