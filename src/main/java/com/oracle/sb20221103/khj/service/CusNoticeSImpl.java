package com.oracle.sb20221103.khj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.sb20221103.domain.CusNotice;
import com.oracle.sb20221103.dto.CusNoticeDTO;
import com.oracle.sb20221103.khj.dao.CusNoticeJPA;

@Service
@Transactional
public class CusNoticeSImpl implements CusNoticeS {

	private final CusNoticeJPA cusNoticeJPA;
	
	@Autowired
	public CusNoticeSImpl(CusNoticeJPA cusNoticeJPA) {
		
		this.cusNoticeJPA = cusNoticeJPA;
	}
	
	@Override
	public List<com.oracle.sb20221103.domain.CusNotice> selNoticeAll() {
		// TODO Auto-generated method stub
		List<com.oracle.sb20221103.domain.CusNotice> noticeList = cusNoticeJPA.selectAll();
		return noticeList;
	}

	@Override
	public CusNotice selNotice(Long cusNo) {
		// TODO Auto-generated method stub
		//com.oracle.sb20221103.domain.CusNotice notice = cusNoticeJPA.select(cusNo);
		
		CusNotice notice = cusNoticeJPA.select(cusNo);
		
		//noticeDTO.setTitle(notice.getTitle());
		
		return notice;
	}

	@Override
	public CusNotice insNotice(CusNotice notice) {
		// TODO Auto-generated method stub
		
		cusNoticeJPA.insert(notice);
		return notice;
	}

	@Override
	public CusNoticeDTO updNotice(Long cusNo, CusNoticeDTO notice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delNotice(Long cusNo) {
		// TODO Auto-generated method stub

	}



}
