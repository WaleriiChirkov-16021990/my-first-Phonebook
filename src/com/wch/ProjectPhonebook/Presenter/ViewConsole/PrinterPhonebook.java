package com.wch.ProjectPhonebook.Presenter.ViewConsole;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;
import com.wch.ProjectPhonebook.Models.Contact;
import com.wch.ProjectPhonebook.Models.Phonebook;

import java.io.FileNotFoundException;
import java.io.Serializable;

/**
 * класс описывает сущность для представления телефонной книги пользователю через консоль
 */
public class PrinterPhonebook extends Phonebook implements Serializable {
	
	
	public PrinterPhonebook() throws FileNotFoundException {
		super();
	}
	
	/**
	 * Метод описания полученной телефонной книги пользователю через консоль
	 * @param dataBase Полученая БД в которой содержится телефонная книга в формета ArrayList<Contact>
	 */
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
