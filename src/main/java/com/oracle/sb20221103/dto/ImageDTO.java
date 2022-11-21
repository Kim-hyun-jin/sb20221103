package com.oracle.sb20221103.dto;

import lombok.Data;

@Data
public class ImageDTO {

	private String tableType;
	private Integer cusNo;//(?��?��게시?��?)게시�? 번호
	private Integer imageNo;
	private String imgPath;
}
