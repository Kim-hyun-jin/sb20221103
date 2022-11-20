package com.oracle.sb20221103.lhj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.sb20221103.dto.Dog;
import com.oracle.sb20221103.lhj.dao.LhjDao;

@Service
//@RequiredArgsConstructor
public class LhjServiceImpl implements LhjService {
	
	private final LhjDao lhjDao;
	
	
	public LhjServiceImpl(LhjDao lhjDao) {
		
		this.lhjDao = lhjDao;
	}

	@Override
	public List<Dog> myDogList(Dog dog) {
		List<Dog> myDogList =null;
		System.out.println("LhjServiceImpl myDogList Start..." );
		myDogList = lhjDao.myDogList(dog);
		System.out.println("LhjServiceImpl myDogList myDogList.size()->" +myDogList.size());
		return myDogList;
	}

	@Override
	public Dog mydogInfo(Long dogNo) {
		System.out.println("LhjServiceImpl mydogInfo Start...");
		Dog dog = null;
		dog = lhjDao.mydogInfo(dogNo);
		return dog;
	}
	

}
