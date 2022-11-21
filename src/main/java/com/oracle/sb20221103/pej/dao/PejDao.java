package com.oracle.sb20221103.pej.dao;

import java.util.List;

import com.oracle.sb20221103.dto.MemberDogDTO;

public interface PejDao {


	List<MemberDogDTO> selMemberDogList();

	List<MemberDogDTO> detailMemberDog(int id);

	






}
