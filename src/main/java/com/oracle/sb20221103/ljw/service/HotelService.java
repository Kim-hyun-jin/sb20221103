package com.oracle.sb20221103.ljw.service;

import java.util.List;

import com.oracle.sb20221103.dto.RoomDTO;


public interface HotelService {
	List<RoomDTO> findRoomList();
}
