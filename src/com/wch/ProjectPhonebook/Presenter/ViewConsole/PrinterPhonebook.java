package com.wch.ProjectPhonebook.Presenter.ViewConsole;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;
import com.wch.ProjectPhonebook.Models.Contact;
import com.wch.ProjectPhonebook.Models.Phonebook;

import java.io.FileNotFoundException;

public class PrinterPhonebook extends Phonebook {
	
	
	public PrinterPhonebook() throws FileNotFoundException {
		super();
	}
	
	public void printPB(DataBase dataBase) {
		new Printer("").print();
		new Printer("Состояние текущей базы: ").print();
		new Printer("=============== THE Start ===============").print();
		for (Contact c: dataBase.getDataBase()
		     ) {
			new PrinterContact(c).printCtc();
		}
		new Printer("=============== THE END ===============").print();
	}

}
