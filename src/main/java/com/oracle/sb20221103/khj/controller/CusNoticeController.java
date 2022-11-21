package com.oracle.sb20221103.khj.controller;


import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oracle.sb20221103.domain.CusNotice;
import com.oracle.sb20221103.dto.CusNoticeDTO;
import com.oracle.sb20221103.khj.service.CusNoticeS;

@Controller
@RequestMapping("/customerService/cusNotice")
public class CusNoticeController {
	
	private final CusNoticeS cusNoticeS;
	
	

	public CusNoticeController(CusNoticeS cusNoticeS) {
		
		this.cusNoticeS = cusNoticeS;
	}

	@GetMapping("/main")
	public String customerServiceCusNoticeMain(Model model) {
		List<com.oracle.sb20221103.domain.CusNotice> noticeList =  cusNoticeS.selNoticeAll();
		
		model.addAttribute("noticeList", noticeList);
		return "customerService/cusNotice/main";
	}
	
	//@PreAuthorize("isAuthenticated()")
	@GetMapping("/detail")
	public String detail(@RequestParam(defaultValue = "1") Long cusNo,Model model) {
		
		//공지글번호로 데이터 조회
		CusNotice notice = cusNoticeS.selNotice(cusNo);
		//조회객체 모델에 담아서 화면에 전달
		model.addAttribute("notice", notice);
		return "customerService/cusNotice/detail";
	}
	
	
	
	
	//글작성
	@PreAuthorize("hasRole('ADMIN')")
	//@PreAuthorize("hasRole('USER')")
	@GetMapping("/write")
	public String writeGet() {
		
		return "customerService/cusNotice/write";
	}

	@PostMapping("/write")
	public String writePost(CusNotice notice) {
		
		
		cusNoticeS.insNotice(notice);
		
		
		//성공 모달창 또는 "validation 문구 표시
		
		return "redirect:/customerService/cusNotice/main";
	}
	
	

	
	//수정
	@GetMapping("/modify")
	public String modify() {
		
		return "customerService/cusNotice/modify";
	}
	
	///삭제
	
}