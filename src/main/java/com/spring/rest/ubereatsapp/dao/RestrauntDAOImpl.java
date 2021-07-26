package com.spring.rest.ubereatsapp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.rest.ubereatsapp.entity.Restraunt;

@Repository
public class RestrauntDAOImpl implements RestrauntDAO {
	
	private EntityManager entityManager;
	
	
	@Autowired
	public RestrauntDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	

	@Override
	public List<Restraunt> findAllRestraunt() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Restraunt> theQuery = currentSession.createQuery("from Restraunt", Restraunt.class);
		
		List<Restraunt> theRestraunts = theQuery.getResultList();
		
		return theRestraunts;
	}

	@Override
	public Restraunt getRestrauntById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Restraunt theRestraunt = currentSession.get(Restraunt.class,theId);
		
		
		return theRestraunt;
	}


	@Override
	public void saveRestraunt(Restraunt theRestraunt) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(theRestraunt);
		
	}
	
	@Override
	public void deleteById(int theId) {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery(
						"delete from Restraunt where id=:restrauntId");
		theQuery.setParameter("restrauntId", theId);
		
		theQuery.executeUpdate();
	}


}
