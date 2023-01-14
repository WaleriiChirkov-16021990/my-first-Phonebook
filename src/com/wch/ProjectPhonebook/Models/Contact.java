package com.wch.ProjectPhonebook.Models;

import com.wch.ProjectPhonebook.Abstract.Class.Human;
import com.wch.ProjectPhonebook.Abstract.Interface.AbleToCall;

import java.util.Date;

public class Contact extends Human implements AbleToCall<Number> {
	private Number number;
	private Commentary commentary;
	
	
	public Contact() {
	}
	
	public Contact(Number number) {
		this.number = number;
	}
	
	public Contact(String firstName, String lastName,Date date, int number, String commentary){
		super.getName().setFirstName(firstName);
		super.getName().setLastName(lastName);
		super.setDateOfBirth(date);
		this.number.setNumberHome(number);
		this.commentary.setComment(commentary);
	}
	
	public Commentary getCommentary() {
		return commentary;
	}
	
	public void setCommentary(Commentary commentary) {
		this.commentary = commentary;
	}
	
	@Override
	public void getCall() {
		System.out.println("Пока не доработан вызов! ( " + getNumber() + " )\n");
	}
	
	@Override
	public Number getNumber() {
	return this.number;
	}
	
	@Override
	public void setNumber(Number number) {
	
	}
}
