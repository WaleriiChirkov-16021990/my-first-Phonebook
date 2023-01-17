package com.wch.ProjectPhonebook.Models;

import java.util.ArrayList;

public class AddNewContact extends Contact{
	public AddNewContact(String firstName, String lastName, String date, int number, String commentary) {
		super(firstName,lastName,date,number,commentary);
	}
	
	public AddNewContact(String firstName, String lastName, String date, int number1,int number2, int number3, String commentary) {
		super(firstName,lastName,date,number1,number2,number3,commentary);
	}
	
	public AddNewContact(String firstName, String lastName, String date, int number1,int number2, String commentary) {
		super(firstName,lastName,date,number1,number2,commentary);
	}
	public void add(ArrayList<Contact> data){
		data.add(this);
	}
}
