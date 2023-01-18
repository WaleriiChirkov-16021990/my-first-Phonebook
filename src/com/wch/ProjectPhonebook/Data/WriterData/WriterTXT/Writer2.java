package com.wch.ProjectPhonebook.Data.WriterData.WriterTXT;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;
import com.wch.ProjectPhonebook.Models.Contact;
import com.wch.ProjectPhonebook.Presenter.ViewConsole.Printer;
import com.wch.ProjectPhonebook.UInterface.UIConsole.UInterfaceCon;

import java.io.FileWriter;
import java.io.IOException;

public class Writer2 extends Writer1{
	private final String file2 = "src/com/wch/ProjectPhonebook/Data/DataFile/Data.txt";
	
	public Writer2(DataBase dataBase) throws IOException {
		super(dataBase);
		super.setFileWriter(new FileWriter(file2));
	}
	
	public Writer2(FileWriter fileWriter) throws IOException {
		super(fileWriter);
		super.setFileWriter(new FileWriter(file2));
	}
	
	public Writer2() throws IOException {
		super();
		super.setFileWriter(new FileWriter(file2));
	}
	
	
	@Override
	public void recordMyPhonebook() throws IOException {
	String temp = "";
		try {
			for (Contact c :
					this.getDataBase().getDataBase()) {
				temp += "Имя : " + c.getName().getFirstName() + "\n";
				temp += "Фамилия : " + c.getName().getLastName() + "\n";
				temp += "Дата : " + c.getDateOfBirth() + "\n";
				temp += "Домашний телефон : " + c.getNumber().getNumberHome() + "\n";
				if (c.getNumber().getNumberMobile() != 0) {
					temp += "Мобильный телефон : " + c.getNumber().getNumberMobile() + "\n";
				}
				if (c.getNumber().getNumberWork() != 0) {
					temp += "Рабочий телефон : " + c.getNumber().getNumberWork() + "\n";
				}
				temp += "Комментарий : " + c.getCommentary().getComment()  + "\n";
				temp += "\n";
				super.getFileWriter().write(temp);
				super.getFileWriter().flush();
				temp = "";
			}
			new Printer(new UInterfaceCon().getFileWrite()).print();
		}  catch (IOException e){
			new Printer(e.getMessage()).print();
		}  finally {
			super.getFileWriter().close();
		}
	}
}
