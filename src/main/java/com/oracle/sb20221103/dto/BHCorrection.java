package com.oracle.sb20221103.dto;

import lombok.Data;

@Data
public class BHCorrection {
	private Long appliNo;
	private String id;
	private Long dogNo;
	private String title;
	private String beforeContent;
	private String status;
	private String teacherId;
	private String startDate;
	private String finishDate;
	private String afterContent;

}
