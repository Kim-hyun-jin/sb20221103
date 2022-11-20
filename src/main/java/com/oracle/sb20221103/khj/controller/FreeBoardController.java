package com.oracle.sb20221103.khj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customerService/freeboard")
public class FreeBoardController {
	
	@GetMapping("/detail")
	public String detail(@RequestParam(defaultValue = "1") int freeboardNo) {
		
		//자유글번호로 데이터 조회
		
		//조회 객체 모델에 담아서 화면에 전달
		
		return "customerService/freeboard/detail";
	}
	
	//글작성
	@GetMapping("/write")
	public String writeGet() {
		
		return "customerService/freeboard/write";
	}

	@PostMapping("/write")
	public String writePost() {
		
		//공지등록 후 결과에 따라 (유효성 검사, 내용검사) 
		
		
		//성공 모달창 또는 "validation 문구 표시
		
		return "redirect:/customerService/freeboard/main";
	}
	
	

	
	//수정
	@GetMapping("/modify")
	public String modify() {
		
		return "customerService/freeboard/modify";
	}

}
