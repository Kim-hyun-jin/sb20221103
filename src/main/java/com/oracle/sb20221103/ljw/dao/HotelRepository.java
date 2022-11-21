package com.oracle.sb20221103.ljw.dao;

import java.util.List;

import com.oracle.sb20221103.dto.RoomDTO;

public interface HotelRepository {
	List<RoomDTO> findRoomList();
}
