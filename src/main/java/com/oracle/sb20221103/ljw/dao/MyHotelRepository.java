package com.oracle.sb20221103.ljw.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.sb20221103.dto.Room;

import lombok.extern.slf4j.Slf4j;

@Repository
//@RequiredArgsConstructor
@Slf4j
public class MyHotelRepository implements HotelRepository {
	private final SqlSession session;

	
	public MyHotelRepository(SqlSession session) {
		
		this.session = session;
	}


	@Override
	public List<Room> findRoomList() {
		List<Room> result = null;
		try {
			result = session.selectList("roomList");
		} catch (Exception e) {
			//log.info("findRoomList() e.getMessage...==>{}",e.getMessage());
			System.out.println("findRoomList() e.getMessage...==>{}"+ e.getMessage());
		}
		return result;
	}

}
