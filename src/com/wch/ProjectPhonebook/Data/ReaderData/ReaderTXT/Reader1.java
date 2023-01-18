package com.wch.ProjectPhonebook.Data.ReaderData.ReaderTXT;

import com.wch.ProjectPhonebook.Data.DataBase.DataBase;
import com.wch.ProjectPhonebook.Models.AddNewContact;
import com.wch.ProjectPhonebook.Models.Contact;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Парсер БД файла фотмата .txt для приведения данных к удобному виду для манипуляций.
 * Данные считываются построчно и в конечном итоге приобретают вид ArrayList<Contact>.
 */
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
	
	/**
	 * Метод читает .txt файл, данные в котором записаны в формате 1 строка = 1 контакт, и имеют запись вида
	 * "FirstName,LastName,dd.mm.yyyy,Number1,Number2,Number3,Comment\n"
	 * FirstName - type String
	 * LastName - type String
	 * dd.mm.yyyy - type String
	 * Number 1 /2 /3 - type int
	 * Comment - type String
	 * Info:   dd.mm.yyyy - date Birth.
	 * @throws IOException - ошибка при отсутствие файла или неверном формате записи БД в файле.
	 */
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
	public ArrayList<String[]> getBase() {
		return base;
	}
	/**
	 * Метод формирует базу на основе полученных из файла строк.
	 * В зависимости от количества прописанных номеров, вызываются разные конструкторы новых контактов.
	 */
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
