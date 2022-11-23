package com.oracle.sb20221103.khj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oracle.sb20221103.dto.FreeBoardDTO;
import com.oracle.sb20221103.khj.service.FreeService;

@Controller
@RequestMapping("/customerService/freeboard")
public class FreeBoardController {
	
	@Autowired
	private FreeService freeService;
	
	public FreeBoardController(FreeService freeService) {
	
		this.freeService = freeService;
	}
	
	

	@GetMapping("/main")
	public String customerServiceFreeboardMain(Model model) {
		
		model.addAttribute("freeList",  freeService.selFreeList());
		return "customerService/freeboard/main";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam(defaultValue = "1") int freeboardNo, Model model) {
		
		//자유글번호로 데이터 조회
		FreeBoardDTO freeboard = freeService.selFree(freeboardNo);
		//조회 객체 모델에 담아서 화면에 전달
		model.addAttribute("freeboard", freeboard);
		return "customerService/freeboard/detail";
	}
	
	//글작성
	//@PreAuthorize("hasRole('ADMIN')")
	//@PreAuthorize("hasRole('MEMBER')")
	@GetMapping("/write")
	public String writeGet() {
		
		return "customerService/freeboard/write";
	}

	//글등록
	@PostMapping("/write")
	public String writePost(FreeBoardDTO freeboard) {
		
		//공지등록 후 결과에 따라 (유효성 검사, 내용검사) 
		freeService.insFree(freeboard);
		
		//성공 모달창 또는 "validation 문구 표시
		
		return "redirect:/customerService/freeboard/main";
	}
	

	
	//수정
	@PreAuthorize("principal.usename == #FreeBoardDTO.writer")
	@GetMapping("/modify")
	public String modify() {
		
		return "customerService/freeboard/modify";
	}
	
	@PreAuthorize("principal.usename == #FreeBoardDTO.writer")
	@PostMapping("/delete")
	public String delete(Long freeboardNo) {
		return "redirect:/customerService/freeboard/main";
	}
	

}
