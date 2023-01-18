package com.wch.ProjectPhonebook.Data.WriterData.WriterTXT;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;
import com.wch.ProjectPhonebook.Presenter.ViewConsole.Printer;
import com.wch.ProjectPhonebook.UInput.UInputConsole.UInCon;
import com.wch.ProjectPhonebook.UInterface.UIConsole.UInterfaceCon;

import java.io.IOException;

public class WriterMain {
	private DataBase dataBase;
	private Writer1 writer1;
	private Writer2 writer2;
	private UInCon uInCon;
	
	public WriterMain() {
	}
	
	public WriterMain(DataBase dataBase) {
		this.dataBase = dataBase;
		uInCon = new UInCon();
	}
	
	public void selectWriter() throws IOException {
		while (true) {
			new Printer(new UInterfaceCon().getMenuWriterStart()).print();
			uInCon.UInput(new UInterfaceCon().getInstruction1());
			if (uInCon.getInput().equals("1")) {
				writer1 = new Writer1(this.dataBase);
				writer1.recordMyPhonebook();
			} else if (uInCon.getInput().equals("2")) {
				writer2 = new Writer2(this.dataBase);
				writer2.recordMyPhonebook();
			} else if (uInCon.getInput().equals("3")) {
				new Printer(new UInterfaceCon().getInstruction2()).print();
				break;
			} else {
				new Printer(new UInterfaceCon().getInstruction3()).print();
			}
		}
	}
}
