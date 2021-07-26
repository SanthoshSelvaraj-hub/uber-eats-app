package com.spring.rest.ubereatsapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restraunt")
public class Restraunt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="restraunt_name")
	private String restrauntName;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="email")
	private String email;
	
	public Restraunt(){
		
	}

	public Restraunt(String restrauntName, String phone, String email) {
		this.restrauntName = restrauntName;
		this.phone = phone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRestrauntName() {
		return restrauntName;
	}

	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Restraunt [id=" + id + ", restrauntName=" + restrauntName + ", phone=" + phone + ", email=" + email
				+ "]";
	}
	
	
	
}
