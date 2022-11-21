package com.oracle.sb20221103.pej.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.sb20221103.dto.MemberDogDTO;

import lombok.RequiredArgsConstructor;

@Repository
//@RequiredArgsConstructor
public class PejDaoImpl implements PejDao {
	private final SqlSession session;

	

	public PejDaoImpl(SqlSession session) {
		
		this.session = session;
	}


	@Override
	public List<MemberDogDTO> selMemberDogList() {
		List<MemberDogDTO> selMemberDogList = null;
		try {
			selMemberDogList = session.selectList("selMemberList");
		} catch (Exception e) {
			System.out.println("PejDaoImpl selMemberDogList Exception->"+e.getMessage());
		}
		return selMemberDogList;
	}


	@Override
	public List<MemberDogDTO> detailMemberDog(int id) {
		List<MemberDogDTO> detailMemberDog = null;
		System.out.println("PejDaoImpl detailMemberDog detailMemberDog start");
		try {
			detailMemberDog = session.selectList("detailMemberDog", id);
			System.out.println("PejDaoImpl detailMemberDog getMember_name->"+detailMemberDog.get(2).getId());
		} catch (Exception e) {
			System.out.println("PejDaoImpl detailMemberDog memberDog.getid->"+detailMemberDog.get(2).getMemberName());
			System.out.println("PejDaoImpl detailMemberDog Exception ->"+e.getMessage());
		}
		return detailMemberDog;
	}



}
