package com.oracle.sb20221103.pej.service;

import java.util.List;

import com.oracle.sb20221103.dto.MemberDogDTO;

public interface PejService {


	List<MemberDogDTO> selMemberDogList();

	List<MemberDogDTO> detailMemberDog(int id);
	



}
