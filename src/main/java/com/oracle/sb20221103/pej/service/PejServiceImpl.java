package com.oracle.sb20221103.pej.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.sb20221103.dto.MemberDogDTO;
import com.oracle.sb20221103.pej.dao.PejDao;

import lombok.RequiredArgsConstructor;

@Service
//@RequiredArgsConstructor
public class PejServiceImpl implements PejService {
	private final PejDao pd;

	
	
	public PejServiceImpl(PejDao pd) {
		
		this.pd = pd;
	}

	@Override
	public List<MemberDogDTO> selMemberDogList() {
		List<MemberDogDTO> selMemberDogList = null;
		System.out.println("PejServiceImpl selMemberList selMemberList Start..");
		selMemberDogList = pd.selMemberDogList();
		System.out.println("PejServiceImpl selMemberList selMemberList.size()->"+selMemberDogList.size());
		return selMemberDogList;
	}

	@Override
	public List<MemberDogDTO> detailMemberDog(int id) {
		System.out.println("PejServiceImpl detailMemberDog Start");
		List<MemberDogDTO> detailMemberDog = null;
		detailMemberDog = pd.detailMemberDog(id);
		return detailMemberDog;
	
	}


		

	

}