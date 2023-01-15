package com.wch.ProjectPhonebook.Models;

import com.wch.ProjectPhonebook.Abstract.Class.Human;
import com.wch.ProjectPhonebook.Abstract.Interface.AbleToCall;
import com.wch.ProjectPhonebook.Presenter.ViewConsole.Printer;

import java.util.Date;

public class Contact extends Human implements AbleToCall<Number> {
	private Number number = new Number();
	private Commentary commentary =  new Commentary();
	
	
	public Contact() {
	}
	
	public Contact(Number number) {
		this.number = number;
	}
	
	public Contact(String firstName, String lastName,String date, int number, String commentary){
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
		new Printer("Пока не доработан вызов! ( " + getNumber() + " )\n");
	}
	
	@Override
	public Number getNumber() {
	return this.number;
	}
	
	@Override
	public void setNumber(Number number) {
	}
}
