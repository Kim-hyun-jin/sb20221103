package com.oracle.sb20221103.khj.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.sb20221103.dto.FreeBoardDTO;


@Repository
public class FreeDAOImpl implements FreeDAO {

	private final SqlSession session;

	public FreeDAOImpl(SqlSession session) {
		
		this.session = session;
	}

	@Override
	public List<FreeBoardDTO> selFreeList() {
		// TODO Auto-generated method stub
		List<FreeBoardDTO> freeList = session.selectList("selFreeList");
		
		return freeList;
	}

	@Override
	public FreeBoardDTO selFree(int freeboardNo) {
		// TODO Auto-generated method stub
		
		FreeBoardDTO freeboard = session.selectOne("selFree", freeboardNo);
		return freeboard;
	}

	@Override
	public int insFree(FreeBoardDTO freeboard) {
		
		int result = session.insert("insFree", freeboard);
		return result;	

	}

}
