package com.spring.rest.ubereatsapp.service;

import java.util.List;

import com.spring.rest.ubereatsapp.entity.Restraunt;

public interface RestrauntService {
	
	public List<Restraunt> findAllRestraunt();
	
	public Restraunt getRestrauntById(int theId);

	void saveRestraunt(Restraunt theRestraunt);	
	
	void deleteRestraunt(int theId);
	
}
