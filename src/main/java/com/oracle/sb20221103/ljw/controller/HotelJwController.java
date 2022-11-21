package com.oracle.sb20221103.ljw.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.oracle.sb20221103.dto.RoomDTO;
import com.oracle.sb20221103.ljw.service.MyHotelService;

import lombok.extern.slf4j.Slf4j;

@Controller
//@RequiredArgsConstructor
@Slf4j
public class HotelJwController {
	private final MyHotelService mhs;
	

	public HotelJwController(MyHotelService mhs) {
		super();
		this.mhs = mhs;
	}


	@GetMapping("/hotel/reservation/main2")
	public String hotelRreservationMain2(Model model) {
		//log.info("hotelRreservationMain2() start...");
		System.out.println("hotelRreservationMain2() start...");
		List<RoomDTO> roomList = mhs.findRoomList();
		model.addAttribute("roomList", roomList);
		//log.info("hotelRreservationMain2() finish..."+roomList.toString());
		System.out.println("hotelRreservationMain2() finish..."+roomList.toString());
		return "hotel/reservation/main";
	}
}
