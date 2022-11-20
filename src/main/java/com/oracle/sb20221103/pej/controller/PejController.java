package com.oracle.sb20221103.pej.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.sb20221103.dto.MemberDog;
import com.oracle.sb20221103.pej.service.PejService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
//@RequiredArgsConstructor
public class PejController {
	private final PejService ps;
	
	
	
	public PejController(PejService ps) {
		
		this.ps = ps;
	}


	@RequestMapping(value = "mypage/member/myInfo")
	public String myInfo() {
		System.out.println("myInfo start");
		
		return "mypage/member/myInfo";
	}
	
	
	@RequestMapping(value = "/mypage/admin/memberList")
	public String selMemberDogList(Model model) {
		System.out.println("PejController selMemberDogList start");
		List<MemberDog> selMemberDogList = ps.selMemberDogList();
		System.out.println("PejController selMemberDogList selMemberDogList.size()->"+selMemberDogList.size());
		System.out.println(""+selMemberDogList.get(2).toString());
		model.addAttribute("selMemberDogList", selMemberDogList);
		
		return "mypage/admin/memberList";
	}
	
	@GetMapping(value = "/mypage/admin/detailMemberDog")
	public String detailMemberDog(int id, Model model) {
		System.out.println("PejController detailMemberDog Start");
		List<MemberDog> detailMemberDog = ps.detailMemberDog(id);
		model.addAttribute("selMemberDogList", detailMemberDog);
		return "mypage/admin/detailMemberDog";


		
	}
}