package com.wch.ProjectPhonebook.Application;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;
import com.wch.ProjectPhonebook.Data.ReaderData.ReaderTXT.Reader1;
import com.wch.ProjectPhonebook.Models.DeleterContact;
import com.wch.ProjectPhonebook.Models.FinderContact;
import com.wch.ProjectPhonebook.Models.Phonebook;
import com.wch.ProjectPhonebook.Presenter.ViewConsole.Printer;
import com.wch.ProjectPhonebook.Presenter.ViewConsole.PrinterPhonebook;
import com.wch.ProjectPhonebook.UInput.UInputConsole.UInCon;
import com.wch.ProjectPhonebook.UInterface.UIConsole.UInterfaceCon;

import java.io.IOException;

public class Application {
	public static void runApp() throws IOException {
		Reader1 reader1 = new Reader1();
		reader1.readFile();
		reader1.ghostData();
		Phonebook phonebook = new Phonebook(reader1.getData());
		UInCon uInCon = new UInCon();
		new Printer(new UInterfaceCon().getGreeting()).print();
		while (true) {
			new Printer(new UInterfaceCon().getMenuStart()).print();
			uInCon.UInput(new UInterfaceCon().getInstruction1());
			if (uInCon.getInput().equals("1")) {     //загрузка данных из файла
				while (true) {
					new Printer(new UInterfaceCon().getMenuReaderStart()).print();
					uInCon.UInput(new UInterfaceCon().getInstruction1());
					if (uInCon.getInput().equals("1")) {
						reader1 = new Reader1();
						 reader1.readFile();
						 reader1.ghostData();
						 phonebook = new Phonebook(reader1.getData());
						 new Printer(new UInterfaceCon().getPhonebookUpdate()).print();
					} else if (uInCon.getInput().equals("2")) {
					
					} else if (uInCon.getInput().equals("3")) {
						new Printer(new UInterfaceCon().getInstruction2()).print();
						break;
					} else {
						new Printer(new UInterfaceCon().getInstruction3()).print();
					}
				}
			} else if (uInCon.getInput().equals("2")) {       //просмотр книги
				new PrinterPhonebook().printPB(phonebook.getDataBase());
			} else if (uInCon.getInput().equals("3")) {       // поиск контакта
				FinderContact finderContact = new FinderContact(phonebook.getDataBase().getDataBase());
				finderContact.addFindContact();
			} else if (uInCon.getInput().equals("4")) {   // удалить контакт
				DeleterContact deleterContact = new DeleterContact(phonebook.getDataBase().getDataBase());
				deleterContact.addFindContact();
				phonebook.getDataBase().setDataBase(deleterContact.deleteContact(deleterContact.getFindContact(),deleterContact.getDataBase()));
			} else if (uInCon.getInput().equals("5")) {   // добавить контакт
				while (true) {
					new Printer(new UInterfaceCon().getMenuReaderStart()).print();
					uInCon.UInput(new UInterfaceCon().getInstruction1());
				}
			} else if (uInCon.getInput().equals("6")) {   // изменить контакт
				while (true) {
					new Printer(new UInterfaceCon().getMenuReaderStart()).print();
					uInCon.UInput(new UInterfaceCon().getInstruction1());
				}
			} else if (uInCon.getInput().equals("7")) {   // записать книгу в файл
				while (true) {
					new Printer(new UInterfaceCon().getMenuReaderStart()).print();
					uInCon.UInput(new UInterfaceCon().getInstruction1());
				}
			} else if (uInCon.getInput().equals("8")) {   //  выход
				new Printer(UInterfaceCon.getCloseApplication()).print();
				break;
			} else {                                      //  ошибка
				new Printer(new UInterfaceCon().getInstruction3()).print();
			}

		}
	}
}
