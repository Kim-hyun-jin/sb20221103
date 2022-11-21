package com.oracle.sb20221103.khj.dao;

import java.util.List;

import com.oracle.sb20221103.dto.FreeBoardDTO;

public interface FreeDAO {

	List<FreeBoardDTO> selFreeList();
	
	FreeBoardDTO selFree(int freeboardNo);

	int insFree(FreeBoardDTO freeboard);
}
