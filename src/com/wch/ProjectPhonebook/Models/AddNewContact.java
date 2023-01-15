package com.wch.ProjectPhonebook.Models;

import java.util.ArrayList;
import java.util.Date;

public class AddNewContact extends Contact{
	public AddNewContact(String firstName, String lastName, String date, int number, String commentary) {
		super(firstName,lastName,date,number,commentary);
	}
	
	public void add(ArrayList<Contact> data){
		data.add(this);
	}
}
