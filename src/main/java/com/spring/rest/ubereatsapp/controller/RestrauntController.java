package com.spring.rest.ubereatsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.ubereatsapp.entity.Restraunt;
import com.spring.rest.ubereatsapp.service.RestrauntServiceImpl;

@RestController
@RequestMapping("/api")
public class RestrauntController {
	
	
	private RestrauntServiceImpl restrauntServiceImpl;
	
	@Autowired
	public RestrauntController (RestrauntServiceImpl theRestrauntServiceImpl) {
		restrauntServiceImpl = theRestrauntServiceImpl;
	}
	
	@GetMapping("/restraunt")
	public List<Restraunt> getRestraunts(){
		return restrauntServiceImpl.findAllRestraunt();
	}
	
	@GetMapping("/restraunt/{restrauntId}")
	public Restraunt getRestrauntById(@PathVariable int restrauntId){
		return restrauntServiceImpl.getRestrauntById(restrauntId);
	}
	
	@PutMapping("/restraunt")
	public Restraunt saveRestraunt(@RequestBody Restraunt theRestraunt) {
		restrauntServiceImpl.saveRestraunt(theRestraunt);
		return theRestraunt;
	}
	
	@DeleteMapping("/restraunt/{restrauntId}")
	public String saveRestraunt(@PathVariable int restrauntId) {
		restrauntServiceImpl.deleteRestraunt(restrauntId);
		return "Deleted restraunt with id "+ restrauntId;
	}
}
