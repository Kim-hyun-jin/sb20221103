package com.oracle.sb20221103.khj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.sb20221103.dto.FreeBoardDTO;
import com.oracle.sb20221103.khj.dao.FreeDAO;

@Service
@Transactional
public class FreeServiceImpl implements FreeService {

	private FreeDAO freeDAO;
	
	
	public FreeServiceImpl(FreeDAO freeDAO) {
		
		this.freeDAO = freeDAO;
	}

	@Override
	public List<FreeBoardDTO> selFreeList() {
		// TODO Auto-generated method stub
		List<FreeBoardDTO> freeList = freeDAO.selFreeList();
		return freeList;
	}

	@Override
	public FreeBoardDTO selFree(int freeboardNo) {
		// TODO Auto-generated method stub
		FreeBoardDTO freeboard = freeDAO.selFree(freeboardNo);
		return freeboard;
	}

	@Override
	public int insFree(FreeBoardDTO freeboard) {
		// TODO Auto-generated method stub
		int result=0;
		
		freeDAO.insFree(freeboard);
		
		return result;
	}

}
