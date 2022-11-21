package com.oracle.sb20221103.lhj.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.sb20221103.dto.DogDTO;

@Repository
//@RequiredArgsConstructor
public class LhjDaoImpl implements LhjDao {
	
	private final SqlSession session;

	
	public LhjDaoImpl(SqlSession session) {
		
		this.session = session;
	}

	@Override
	public List<DogDTO> myDogList(DogDTO dog) {
		List<DogDTO> myDogList = null;
		System.out.println("LhjDaoImpl myDogList Start ..." );
		try {
			myDogList = session.selectList("hjMyDogList" , dog);
			System.out.println("LhjDaoImpl myDogList myDogList.size()->"+myDogList.size());
			
		} catch (Exception e) {
			System.out.println("LhjDaoImpl myDogList e.getMessage()->"+e.getMessage());
		}
		return myDogList;
	}

	@Override
	public DogDTO mydogInfo(Long dogNo) {
		System.out.println("LhjDaoImpl mydogInfo start..");
		DogDTO dog = new DogDTO();
		try {
			dog = session.selectOne("mydogInfo", dogNo);
		} catch (Exception e) {
			System.out.println("LhjDaoImpl mydogInfo Exception->"+e.getMessage());
		}
		return dog;
	}

}
