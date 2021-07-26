package com.spring.rest.ubereatsapp.dao;

import java.util.List;

import com.spring.rest.ubereatsapp.entity.Restraunt;

public interface RestrauntDAO {
	
	public List<Restraunt> findAllRestraunt();
	
	public Restraunt getRestrauntById(int theId);

	void saveRestraunt(Restraunt theRestraunt);

	void deleteById(int theId);
	
}
