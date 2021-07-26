package com.spring.rest.ubereatsapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.ubereatsapp.dao.RestrauntDAOImpl;
import com.spring.rest.ubereatsapp.entity.Restraunt;

@Service
public class RestrauntServiceImpl implements RestrauntService {
	
	
	private RestrauntDAOImpl restrauntDAOImpl;
	
	@Autowired
	public RestrauntServiceImpl (RestrauntDAOImpl theRestrauntDAOImpl) {
		
		restrauntDAOImpl = theRestrauntDAOImpl;
		
	}
	
	
	@Override
	@Transactional
	public List<Restraunt> findAllRestraunt() {
		return restrauntDAOImpl.findAllRestraunt();
	}


	@Override
	@Transactional
	public Restraunt getRestrauntById(int theId) {
		return restrauntDAOImpl.getRestrauntById(theId);
	}

	
	@Override
	@Transactional
	public void saveRestraunt(Restraunt theRestraunt) {
		restrauntDAOImpl.saveRestraunt(theRestraunt);
	}
	
	@Override
	@Transactional
	public void deleteRestraunt(int restrauntId) {
		restrauntDAOImpl.deleteById(restrauntId);
	}


}
