package com.oracle.sb20221103.dto;

import lombok.Data;

@Data
public class ReservationDTO {
	private Long res_no;
	private int roomNum;
	private String resStartdate;
	private String resEnddate;
	
	
}
