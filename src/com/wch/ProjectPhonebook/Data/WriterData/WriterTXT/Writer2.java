package com.wch.ProjectPhonebook.Data.WriterData.WriterTXT;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;

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
}
