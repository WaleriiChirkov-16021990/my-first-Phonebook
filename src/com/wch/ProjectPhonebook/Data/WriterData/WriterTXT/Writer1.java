package com.wch.ProjectPhonebook.Data.WriterData.WriterTXT;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;
import com.wch.ProjectPhonebook.Models.Contact;
import com.wch.ProjectPhonebook.Presenter.ViewConsole.Printer;

import java.io.FileWriter;
import java.io.IOException;

public class Writer1 {
	private DataBase dataBase;
	private FileWriter fileWriter;
	
	private final String file = "src/com/wch/ProjectPhonebook/Data/DataFile/DataRow.txt";
	
	public Writer1(DataBase dataBase) throws IOException {
		this.dataBase = dataBase;
//		fileWriter = new FileWriter(file);
	}
	
	public Writer1(FileWriter fileWriter) throws IOException {
		this.fileWriter = fileWriter;
//		fileWriter = new FileWriter(file);
	}
	
	public Writer1() throws IOException {
//		fileWriter = new FileWriter(file);
	
	}
	
	public DataBase getDataBase() {
		return dataBase;
	}
	
	public void setDataBase(DataBase dataBase) {
		this.dataBase = dataBase;
	}
	
	public FileWriter getFileWriter() {
		return fileWriter;
	}
	
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void recordMyPhonebook() throws IOException {
		String temp = "";
		try {
			this.fileWriter = new FileWriter(file);
			for (Contact contact:
			     this.dataBase.getDataBase()) {
				temp = "";
				temp += contact.getName().getFirstName() + ",";
				temp += contact.getName().getLastName() + ",";
				temp += contact.getDateOfBirth() + ",";
				temp += String.valueOf(contact.getNumber().getNumberHome()) + ",";
				if (contact.getNumber().getNumberMobile() != 0) {
					temp += String.valueOf(contact.getNumber().getNumberMobile()) + ",";
				}
				if (contact.getNumber().getNumberWork() != 0) {
					temp += String.valueOf(contact.getNumber().getNumberWork()) + ",";
				}
				temp += contact.getCommentary().getComment();
				fileWriter.write(temp);
				fileWriter.write("\n");
				fileWriter.flush();
			}
		} catch (IOException e){
			new Printer(e.getMessage()).print();
		} finally {
			fileWriter.close();
		}
	}
}
