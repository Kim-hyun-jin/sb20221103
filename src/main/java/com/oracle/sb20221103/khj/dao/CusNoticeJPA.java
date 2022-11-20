package com.oracle.sb20221103.khj.dao;

import java.util.List;
import java.util.Optional;

import com.oracle.sb20221103.domain.CusNotice;

public interface CusNoticeJPA {

	List<CusNotice> selectAll();
	
	CusNotice select(Long cusNo);
	
	CusNotice insert(CusNotice cusNotice);
	
	
	//CusNotice selectAll(Pageabl)
	
	CusNotice update(Long cusNo, CusNotice cusNotice) throws Exception;
	
	void delete(Long cusNo)throws Exception;
}
