package com.oracle.sb20221103.lhj.dao;

import java.util.List;

import com.oracle.sb20221103.dto.DogDTO;

public interface LhjDao {

	List<DogDTO>   myDogList(DogDTO dog);
	DogDTO         mydogInfo(Long dogNo);

}
