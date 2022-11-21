package com.oracle.sb20221103.khj.repository;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.oracle.sb20221103.domain.CusNotice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class CusNoticeTest {

	@Autowired
	private CusNoticeRepository cusNoticeRepository;
	
	@Test
	public void testInsert() {
		IntStream.range(1, 50).forEach(i -> {
			
			CusNotice notice = CusNotice.builder()
								.title("title :"+ i)
								.content("content: "+ i)
								.build();
			
			CusNotice result = cusNoticeRepository.save(notice);
			log.info("cusNo: "+ result.getCusNo());
		});
	}
}
