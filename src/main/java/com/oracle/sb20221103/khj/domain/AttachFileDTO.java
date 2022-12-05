package com.oracle.sb20221103.khj.domain;

import lombok.Data;

@Data
public class AttachFileDTO {

	private String fileName; //원본 파일 이름
	private String uploadPath; //업로드 경로
	private String uuid;
	private boolean image; //이미지 여부
}
