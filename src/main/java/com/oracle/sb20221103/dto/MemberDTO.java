package com.oracle.sb20221103.dto;

import java.util.HashSet;
import java.util.Set;

import com.oracle.sb20221103.khj.domain.MemberRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
	private int	 	id;				// ?��?��번호
	private String 	username;		// ?��?��?��?��?��
	//private String 	role;			// 권한
	@Builder.Default
	private Set<MemberRole> roleSet = new HashSet<>();
	private String 	password;		// 비�?번호
	private Long	memberCall;		// ?��?���?
	private String	memberName;		// ?���?
	private String	memberAddress;	// 주소
	private String	memberEmail;	// ?��메일
	private String	profImg;		// ?��로필?���?
	private String	teacher;		// ?��?��?��?��?��
	private Long	memberDrop;		// ?��?��?���?
	
	public void addRole(MemberRole memberRole) {
		this.roleSet.add(memberRole);
	}
	
	public void clearRole(MemberRole memberRole) {
		this.roleSet.clear();
	}
}
