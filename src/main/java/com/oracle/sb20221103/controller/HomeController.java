package com.oracle.sb20221103.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	//--------------------------------------硫붿씤--------------------------------------------------------------------------------------
		@GetMapping("/")
		public String root() {
			return "main/index";
		}	
		@GetMapping("/index")
		public String index() {
			return "main/index";
		}
		
		
	//--------------------------------------회원관리--------------------------------------------------------------------------------------	
		
		@GetMapping("/main/login")
		public String loginForm(String error, String logout,Model model) {
			
			System.out.println("loginForm");
			System.out.println("logout: "+ logout);
			
			if(error != null) {
				model.addAttribute("error", "Login error check out your accout");
			}
			if(logout != null) {
				System.out.println("user logout");
				model.addAttribute("logout", " logout success");
			}
			
			return "main/loginForm";
		}
		
		@GetMapping("/main/signup")
		public String signupForm() {
			return "main/signupForm";
		}
		
		
		
		//留덉씠�럹�씠吏�
		@GetMapping("/mypage/admin/main")
		public String mypageAdminMain() {
			return "mypage/admin/main";
		}
		
		@GetMapping("/mypage/member/main")
		public String mypageMemberMain() {
			return "mypage/member/main";
		}

	//--------------------------------------�샇�뀛--------------------------------------------------------------------------------------
		//�샇�뀛�떆�꽕�븞�궡
		@GetMapping("/hotel/intro")
		public String hotelIntro() {
			return "hotel/intro";
		}
		
		//�샇�뀛�씠�슜�븞�궡
		@GetMapping("/hotel/usage")
		public String hotelUsage() {
			return "hotel/usage";
		}
		//�샇�뀛�쑀�쓽�궗�빆
		@GetMapping("/hotel/caution")
		public String hotelCaution() {
			return "hotel/caution";
		}
		//�샇�뀛�삁�빟�븯湲�
		@GetMapping("/hotel/reservation/main")
		public String hotelRreservationMain() {
			return "hotel/reservation/main";
		}
		
		
	//--------------------------------------�쑀移섏썝-------------------------------------------------------------------------------------
		//�쑀移섏썝 �떆�꽕�븞�궡
		@GetMapping("/school/intro")
		public String schoolIntro() {
			return "school/intro";
		}
		
		//�쑀移섏썝 �씠�슜�븞�궡
		@GetMapping("/school/usage")
		public String schoolUsage() {
			return "school/usage";
		}
		
		//�쑀移섏썝 �븣由쇱옣
		@GetMapping("/school/dogNotice/main")
		public String schoolDogNotice() {
			return "school/dogNotice/main";
		}
		
		//�뻾�룞援먯젙�떊泥�
		@GetMapping("/school/BHCorrection/main")
		public String schoolBHCorrectionMain() {
			return "school/BHCorrection/main";
		}
		
		
	//--------------------------------------怨좉컼�꽌鍮꾩뒪------------------------------------------------------------------------------------
		
//		//怨듭��궗�빆 硫붿씤�럹�씠吏�
//		@GetMapping("/customerService/cusNotice/main")
//		public String customerServiceCusNoticeMain() {
//			return "customerService/cusNotice/main";
//		}
		
		//QA 硫붿씤�럹�씠吏�
		@GetMapping("/customerService/QA/QA")
		public String customerServiceQAMain() {
			return "customerService/QA/QA";
		}
		
//		//�옄�쑀寃뚯떆�뙋 硫붿씤�럹�씠吏�
//		@GetMapping("/customerService/freeboard/main")
//		public String customerServiceFreeboardMain() {
//			return "customerService/freeboard/main";
//		}
}
