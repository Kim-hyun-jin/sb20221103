package com.oracle.sb20221103.dto;

import lombok.Data;

@Data
public class FreeReplyDTO {

	private String freeboardNo;
	private Integer replyNo;
	private String memberId;
	private String replyContent;
	private String replyRegdate;
}
