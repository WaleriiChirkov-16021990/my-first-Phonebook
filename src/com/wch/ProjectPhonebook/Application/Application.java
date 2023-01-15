package com.wch.ProjectPhonebook.Application;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;
import com.wch.ProjectPhonebook.Data.ReaderData.ReaderTXT.Reader1;
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
			if (uInCon.getInput().equals("2")) {
				new PrinterPhonebook().printPB(phonebook.getDataBase());
			} else if (uInCon.getInput().equals("7")) {
				break;
			}

		}
	}
}
