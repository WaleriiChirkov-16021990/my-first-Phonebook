package com.wch.ProjectPhonebook.Data.ReaderData.ReaderTXT;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;
import com.wch.ProjectPhonebook.Models.AddNewContact;
import com.wch.ProjectPhonebook.Models.Contact;
import com.wch.ProjectPhonebook.Presenter.ViewConsole.Printer;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Reader1 {
	private final BufferedReader reader = new BufferedReader(new FileReader("src/com/wch/ProjectPhonebook/Data/DataFile/Data.txt"));

	private DataBase dataBase;
	private String line;
	private ArrayList<String[]> base = new ArrayList<>();
	private ArrayList<Contact> data = new ArrayList<>();
	
	public ArrayList<Contact> getData() {
		return data;
	}
	
	public Reader1() throws FileNotFoundException {
	
	}
	
	public void readFile() throws IOException {
		try{
			while((line = reader.readLine()) != null){
				base.add(line.split(","));
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			reader.close();
		}
	}
	
	public DataBase getDataBase() {
		return dataBase;
	}
	
	public void setDataBase(DataBase dataBase) {
		this.dataBase = dataBase;
	}
	
	public BufferedReader getReader() {
		return reader;
	}
	
	public String getLine () {
		return line;
	}
	
	public void ghostData() {
		for (String[] c: this.base
		     ) {
			
//			Contact contact = new Contact();
//			for (int i = 0; i < c.length; i++) {
//				if (i == 0) {
//					contact.getName().setFirstName(c[i]);
//				} else if (i==1) {
//					contact.
//				} else if (i==2) {
//
//				} else if (i==3) {
//
//				} else if (i==4) {
//
//				} else if (i==5) {
//
//				} else if (i==6) {
//
//				} else {
//					new Printer("Ошибка данных !").print();
//				}
//			}
			data.add(new AddNewContact(c[0],c[1], c[2],Integer.parseInt(c[3]), c[c.length-1]));
		}
	}
}
