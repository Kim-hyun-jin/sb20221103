package com.oracle.sb20221103.dto;

import lombok.Data;


@Data
public class CusNoticeDTO {

	private Long cusNo;
	private String Id;//회원아이디
	private String title;
	private String content;
	private String regdate; // ???��?�� ?�� ?��맷터�? date

	
}
