package com.oracle.sb20221103.khj.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;

import com.oracle.sb20221103.domain.CusNotice;
import com.oracle.sb20221103.khj.repository.CusNoticeRepository;


//@Service
@Repository
public class CusNotiveJPAImpl implements CusNoticeJPA {

	@Autowired
	private final CusNoticeRepository cusNoticeRepository;
	
	
	public CusNotiveJPAImpl(CusNoticeRepository cusNoticeRepository) {
		
		this.cusNoticeRepository = cusNoticeRepository;
	}

	//DB 문제로 조회 안됨
	@Override
	public List<CusNotice> selectAll() {
		// TODO Auto-generated method stub
		List<CusNotice> noticeList = cusNoticeRepository.findAll();
		System.out.println("CusNotiveJPAImpl selectAll size:"+ noticeList.size() );
		return noticeList;
	}
	
	@Override
	public CusNotice select(Long cusNo) {
		// TODO Auto-generated method stub
		
		CusNotice selectedNotice = cusNoticeRepository.getReferenceById(cusNo);
				
									//cusNoticeRepository.findById(cusNo);
		return   selectedNotice;
	}
	
	
	
	@Override
	public CusNotice insert(CusNotice notice) {
		// TODO Auto-generated method stub
		
		CusNotice insertedNotice = cusNoticeRepository.save(notice);
		//log
		return insertedNotice;
	}



	@Override
	public CusNotice update(Long cusNo, CusNotice cusNotice) throws Exception {
		// TODO Auto-generated method stub
		
		Optional<CusNotice> selectedNotice = cusNoticeRepository.findById(cusNo);
		
		CusNotice updatedNotice;
		if(selectedNotice.isPresent()) {
			CusNotice notice = selectedNotice.get();
			//notice.setTitle("제목수정");
			
			updatedNotice = cusNoticeRepository.save(notice);
			
		}else {
			
			throw new Exception();
		}
			
		return updatedNotice;
	}

	@Override
	public void delete(Long cusNo) throws Exception{
		// TODO Auto-generated method stub
		Optional<CusNotice> selectedNotice = cusNoticeRepository.findById(cusNo);
		
		if(selectedNotice.isPresent()) {
			CusNotice notice = selectedNotice.get();
			
			cusNoticeRepository.delete(notice);
		
		}else {
			
			throw new Exception();
		}
		

	}




}
