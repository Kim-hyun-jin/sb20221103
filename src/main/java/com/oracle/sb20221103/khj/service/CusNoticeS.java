package com.oracle.sb20221103.khj.service;

import java.util.List;

import com.oracle.sb20221103.domain.CusNotice;
import com.oracle.sb20221103.dto.CusNoticeDTO;

public interface CusNoticeS {

	//나중에 페이징 처리용 객체 파라미터로 전달(pageable)
	List<com.oracle.sb20221103.domain.CusNotice> selNoticeAll();
	
	CusNotice selNotice(Long cusNo);
	
	//CusNotice selNotice(Long cusNo);
	//CusNoticeDTO insNotice(CusNoticeDTO notice);
	
	CusNoticeDTO updNotice(Long cusNo, CusNoticeDTO notice);
	
	void delNotice(Long cusNo);

	CusNotice insNotice(CusNotice notice);
	 
}
