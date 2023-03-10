package com.wch.ProjectPhonebook.Presenter.ViewConsole;

import com.wch.ProjectPhonebook.Models.Contact;

import java.io.Serializable;

/**
 * Класс описывает отображение переданного экземпляру контакта в консоли
 */
public class PrinterContact extends Contact implements Serializable {
	private Contact contact;
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public PrinterContact(Contact contact) {
		this.contact = contact;
	}
	
	/**
	 * Метод форматированного отображения контакта в консоли.
	 * Пример:
	 * Имя : Галина
	 * Фамилия : Максакова
	 * Дата : 13.10.1985
	 * Домашний телефон : 4444
	 * Мобильный телефон : 44444
	 * Рабочий телефон : 444444
	 * Комментарий : ноготочки
	 */
	public void printCtc() {
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				new Printer("Name: " + contact.getName().getFirstName()).print();
			} else if (i == 1) {
				new Printer("LastName: " + contact.getName().getLastName()).print();
			} else if (i == 2) {
				new Printer("Date of Birth: " + contact.getDateOfBirth()).print();
			} else if (i == 3) {
				if (contact.getNumber().getNumberHome() != 0) {
					new Printer("Home number: " + contact.getNumber().getNumberHome()).print();
				}
				if (contact.getNumber().getNumberMobile() != 0) {
					new Printer("Mobile number: " + contact.getNumber().getNumberMobile()).print();
				}
				if (contact.getNumber().getNumberWork() != 0) {
					new Printer("Work number: " + contact.getNumber().getNumberWork()).print();
				}
			} else {
				new Printer("Commentary: " + contact.getCommentary().getComment()).print();
			}
		}
		new Printer("").print();
	}
}
