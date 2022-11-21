package com.oracle.sb20221103.khj.service;

import java.util.List;

import com.oracle.sb20221103.dto.FreeBoardDTO;

public interface FreeService {

	List<FreeBoardDTO> selFreeList();
	FreeBoardDTO selFree(int freeboardNo);
	int insFree(FreeBoardDTO freeboard);
}
