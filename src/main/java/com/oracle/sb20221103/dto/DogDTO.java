package com.oracle.sb20221103.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class DogDTO {
	private String 	id;  		  //?��?��?��?��?��
	private Long 	dogNo;  	  //반려견번?��
	private String 	dogName; 	  //반려견이�?
	private Long 	dogGender;   //반려견성�?
	private Long 	dogAge; 	  //반려견나?��
	private Long 	dogWeight;   //반려견몸무게
	private String 	dogMemo; 	  //?��?��?��?��
	private Long 	deSexibng;   //중성?��?���?
	private String 	dogKind; 	  //견종�?
	private Long 	joinCheck;   //?��치원�??��?��?��
	private String 	scStartdate; //?��치원?��?��?��
	private String 	scEnddate;   //?��치원종료?��
	

}
