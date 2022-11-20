package com.oracle.sb20221103.dto;

import lombok.Data;

@Data
public class Room {
	private String roomType;
	private int roomPrice;
	private String roomFunction;
	private int limitSize;
}
