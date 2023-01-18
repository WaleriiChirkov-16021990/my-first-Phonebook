package com.wch.ProjectPhonebook.Application;

import com.wch.ProjectPhonebook.Data.ReaderData.ReaderTXT.Reader1;
import com.wch.ProjectPhonebook.Data.ReaderData.ReaderTXT.Reader2;
import com.wch.ProjectPhonebook.Data.ReaderData.ReaderTXT.ReaderMain;
import com.wch.ProjectPhonebook.Data.WriterData.WriterTXT.WriterMain;
import com.wch.ProjectPhonebook.Models.*;
import com.wch.ProjectPhonebook.Presenter.ViewConsole.Printer;
import com.wch.ProjectPhonebook.Presenter.ViewConsole.PrinterPhonebook;
import com.wch.ProjectPhonebook.UInput.UInputConsole.UInCon;
import com.wch.ProjectPhonebook.UInterface.UIConsole.UInterfaceCon;

import java.io.IOException;

/**
 * Приложение
 */
public class Application {
	/**
	 * Метод запуска
	 * @throws IOException - возможны ошибки работы с файлами.
	 */
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
			if (uInCon.getInput().equals("1")) {     //загрузка данных из файлов
				ReaderMain readerMain = new ReaderMain(phonebook.getDataBase());
				readerMain.downloadPhonebook();
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
				AddNewContact newContact = new AddNewContact();
				newContact.enterNewContact();
				newContact = new AddNewContact(newContact.getName().getFirstName(),newContact.getName().getLastName(),newContact.getDateOfBirth(), newContact.getNumber().getNumberHome(), newContact.getCommentary().getComment());
				newContact.add(phonebook.getDataBase().getDataBase());
			} else if (uInCon.getInput().equals("6")) {   // изменить контакт
				ChangeContact changeContact = new ChangeContact(phonebook.getDataBase().getDataBase());
				changeContact.addFindContact();
				changeContact.changeContact();
			} else if (uInCon.getInput().equals("7")) {   // записать книгу в файл
				WriterMain writerMain = new WriterMain(phonebook.getDataBase());
				writerMain.selectWriter();
			} else if (uInCon.getInput().equals("8")) {   //  выход
				new Printer(UInterfaceCon.getCloseApplication()).print();
				break;
			} else {                                      //  ошибка
				new Printer(new UInterfaceCon().getInstruction3()).print();
			}
		}
	}
}
