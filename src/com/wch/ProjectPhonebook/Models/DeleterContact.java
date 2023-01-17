package com.wch.ProjectPhonebook.Models;

import com.wch.ProjectPhonebook.Presenter.ViewConsole.PrinterContact;

import java.util.ArrayList;

public class DeleterContact extends FinderContact {
	private Contact delContact;
	
	public DeleterContact(ArrayList<Contact> dataBase) {
		super(dataBase);
	}
	
	public ArrayList<Contact> deleteContact(ArrayList<Contact> findContact, ArrayList<Contact> data) {
		for (Contact c:
				findContact
		     ) {
		data.remove(c);
		}
		return data;
	}
}
