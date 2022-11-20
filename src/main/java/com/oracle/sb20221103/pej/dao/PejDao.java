package com.oracle.sb20221103.pej.dao;

import java.util.List;

import com.oracle.sb20221103.dto.MemberDog;

public interface PejDao {


	List<MemberDog> selMemberDogList();

	List<MemberDog> detailMemberDog(int id);

	






}
