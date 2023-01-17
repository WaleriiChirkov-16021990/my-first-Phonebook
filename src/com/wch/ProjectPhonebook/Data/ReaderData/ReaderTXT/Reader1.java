package com.wch.ProjectPhonebook.Data.ReaderData.ReaderTXT;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;
import com.wch.ProjectPhonebook.Models.AddNewContact;
import com.wch.ProjectPhonebook.Models.Contact;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader1 {
	private  BufferedReader reader;

	private DataBase dataBase;
	private String line;
	private ArrayList<String[]> base;
	private ArrayList<Contact> data;
	
	private final String file = "src/com/wch/ProjectPhonebook/Data/DataFile/DataRow.txt";
	
	public ArrayList<Contact> getData() {
		return data;
	}
	
	public Reader1() throws FileNotFoundException {
		base = new ArrayList<>();
		data = new ArrayList<>();
		this.reader = new BufferedReader(new FileReader(file));
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
	
	public void setReader(BufferedReader reader) {
		this.reader = reader;
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
	
	
	public void setLine(String line) {
		this.line = line;
	}
	
	public ArrayList<String[]> getBase() {
		return base;
	}
	
	public void setBase(ArrayList<String[]> base) {
		this.base = base;
	}
	
	public void setData(ArrayList<Contact> data) {
		this.data = data;
	}
	
	public void ghostData() {
		for (String[] c: this.base
		     ) {
			if (c.length == 7) {
				data.add(new AddNewContact(c[0], c[1], c[2], Integer.parseInt(c[3]), Integer.parseInt(c[4]), Integer.parseInt(c[5]), c[c.length - 1]));
			} else if (c.length == 6) {
				data.add(new AddNewContact(c[0], c[1], c[2], Integer.parseInt(c[3]), Integer.parseInt(c[4]), c[c.length - 1]));
			} else if (c.length == 5) {
				data.add(new AddNewContact(c[0], c[1], c[2], Integer.parseInt(c[3]), c[c.length - 1]));
			}
		}
	}
}
