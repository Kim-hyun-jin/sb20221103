package com.oracle.sb20221103.lhj.repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
//@RequiredArgsConstructor
public class LhjRepositoryImpl implements LhjRepository {
	
	private final EntityManager em;

	public LhjRepositoryImpl(EntityManager em) {
		
		this.em = em;
	}
	
	

}
