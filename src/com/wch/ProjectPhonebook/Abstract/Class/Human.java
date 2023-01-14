package com.wch.ProjectPhonebook.Abstract.Class;

import com.wch.ProjectPhonebook.Models.Name;

import java.util.Date;

public abstract class Human {
	private Name name;
	private Date dateOfBirth;
	
	
	
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	
	
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
