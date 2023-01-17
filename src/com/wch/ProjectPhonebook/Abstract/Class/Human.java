package com.wch.ProjectPhonebook.Abstract.Class;

import com.wch.ProjectPhonebook.Models.Name;

import java.util.Date;

public abstract class Human {
	private Name name = new Name();
	private String dateOfBirth;
	
	
	
	
	public Name getName() {
		return name;
	}
	
//	public void setName(Name name) {
//		this.name = name;
//	}
	
	
	
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
