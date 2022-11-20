package com.oracle.sb20221103.pej.service;

import java.util.List;

import com.oracle.sb20221103.dto.MemberDog;

public interface PejService {


	List<MemberDog> selMemberDogList();

	List<MemberDog> detailMemberDog(int id);
	



}
