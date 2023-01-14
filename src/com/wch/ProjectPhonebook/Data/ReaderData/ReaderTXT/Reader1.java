package com.wch.ProjectPhonebook.Data.ReaderData.ReaderTXT;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;
import com.wch.ProjectPhonebook.Data.DataFile.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader1 {
//		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Валерий Чирков\\IdeaProjects\\Phonebook\\src\\com\\wch\\ProjectPhonebook\\Data\\DataFile\\Data.txt"));
	private BufferedReader reader = new BufferedReader(new FileReader("src/com/wch/ProjectPhonebook/Data/DataFile/Data.txt"));
	private DataBase dataBase;
	private String tempString;
	
	public Reader1() throws IOException {
		try{
			StringBuilder stringBuilder = new StringBuilder();
			String line = reader.readLine();
			
			while(line != null){
				stringBuilder.append(line);
				stringBuilder.append(System.lineSeparator());
				line = reader.readLine();
			}
			this.tempString =  stringBuilder.toString();
			
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
	
	public String getTempString() {
		return tempString;
	}
}
