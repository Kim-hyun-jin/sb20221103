package com.oracle.sb20221103.lhj.service;

import java.util.List;

import com.oracle.sb20221103.dto.DogDTO;

public interface LhjService {
	List<DogDTO> 	myDogList(DogDTO dog);
	DogDTO         mydogInfo(Long dogNo);

}
