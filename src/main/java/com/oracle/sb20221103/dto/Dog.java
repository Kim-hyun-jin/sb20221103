package com.oracle.sb20221103.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Dog {
	private String 	id;  		  //????΄?
	private Long 	dogNo;  	  //λ°λ €κ²¬λ²?Έ
	private String 	dogName; 	  //λ°λ €κ²¬μ΄λ¦?
	private Long 	dogGender;   //λ°λ €κ²¬μ±λ³?
	private Long 	dogAge; 	  //λ°λ €κ²¬λ?΄
	private Long 	dogWeight;   //λ°λ €κ²¬λͺΈλ¬΄κ²
	private String 	dogMemo; 	  //?Ή?΄?¬?­
	private Long 	deSexibng;   //μ€μ±??¬λΆ?
	private String 	dogKind; 	  //κ²¬μ’λͺ?
	private Long 	joinCheck;   //? μΉμκ°????
	private String 	scStartdate; //? μΉμ???Ό
	private String 	scEnddate;   //? μΉμμ’λ£?Ό
	

}
