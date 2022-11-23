package com.oracle.sb20221103.khj.security;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CommonController {

	@GetMapping("/error/accessError")
	public void accessDenied(Authentication auth, Model model) {
		model.addAttribute("errormsg", "접근권한이 없습니다");
	}
	
	@GetMapping("/logout")
	public void logoutGet() {
		System.out.println("custom logout");
		
	}
	

}
