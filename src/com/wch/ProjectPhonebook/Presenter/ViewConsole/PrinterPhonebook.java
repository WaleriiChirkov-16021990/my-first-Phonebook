package com.wch.ProjectPhonebook.Presenter.ViewConsole;

import com.wch.ProjectPhonebook.Models.Contact;
import com.wch.ProjectPhonebook.Models.Phonebook;

public class PrinterPhonebook extends Phonebook {
	
	public void printPB() {
		for (Contact c: super.getDataBase()
		     ) {
			new PrinterContact(c).printCtc();
		}
	}

}
