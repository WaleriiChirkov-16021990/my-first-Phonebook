package com.wch.ProjectPhonebook.Presenter.ViewConsole;

import com.wch.ProjectPhonebook.Models.Contact;

public class PrinterContact extends Contact {
	private Contact contact;
	
	public PrinterContact(Contact contact) {
		this.contact = contact;
	}
	
	public Contact getContact() {
		return contact;
	}
	
	public void printCtc() {
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				System.out.println(contact.getName().getFirstName());
			} else if (i == 1) {
				System.out.println(contact.getName().getLastName());
			} else if (i == 2) {
				System.out.println(contact.getDateOfBirth());
			} else if (i == 3) {
				if (contact.getNumber().getNumberHome() != 0) {
					System.out.println(contact.getNumber().getNumberHome());
				}
				if (contact.getNumber().getNumberMobile() != 0) {
					System.out.println(contact.getNumber().getNumberMobile());
				}
				if (contact.getNumber().getNumberWork() != 0) {
					System.out.println(contact.getNumber().getNumberWork());
				}
			} else {
				System.out.println(contact.getCommentary().getComment());
			}
		}
		System.out.println();
	}
}
