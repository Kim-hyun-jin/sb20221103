package com.oracle.sb20221103.lhj.service;

import java.util.List;

import com.oracle.sb20221103.dto.Dog;

public interface LhjService {
	List<Dog> 	myDogList(Dog dog);
	Dog         mydogInfo(Long dogNo);

}
