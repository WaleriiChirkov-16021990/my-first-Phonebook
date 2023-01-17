package com.wch.ProjectPhonebook.UInterface.UIConsole;

public class UInterfaceCon {
	private final static String greeting = "Добро пожаловать в телефонный справочник.";
	private final static String menuStart =    "\n1.Загрузить новую книгу из файла  " +
										"\n2.Просмотреть текущую книгу  " +
										"\n3.Найти контакт  " +
										"\n4.Удалить контакт  " +
										"\n5.Добавить контакт  " +
										"\n6.Изменить контакт  " +
										"\n7.Записать тукущую внигу в файл " +
										"\n8.Exit" ;
	private final static String menuReaderStart =          "\n1.Загрузить из файла 1 " +
													"\n2.Загрузить из файла 2 " +
													"\n3.Выйти в главное меню" ;
	private final static String menuFinderStart =  "\n1.Поиск по имени  " +
											"\n2.Поиск по фамилии  " +
											"\n3.Поиск по телефону  " +
											"\n4.Exit" ;
	private final static String menuFinderFindContact =    "\n1.Позвонить  " +
													"\n2.Изменить  " +
													"\n3.Удалить  " +
													"\n4.Новый поиск " +
													"\n5.Exit ";
	
	private final static String phonebookUpdate = "\nТелефонный справочник успешно обновлен";
	
	private final static String enterFName = "\n1.Введите имя : ";
	private final static String enterLName = "\n1.Введите фамилию : ";
	private final static String enterNumber = "\n1.Введите телефон : ";
	private final static String closeApplication = "\nПрограмма завершена.";
	private final String contactNotFound = "\nКонтакт не найден!";
	
	public String getContactNotFound() {
		return contactNotFound;
	}
	
	public static String getCloseApplication() {
		return closeApplication;
	}
	
	public  String getEnterFName() {
		return enterFName;
	}
	
	public String getEnterLName() {
		return enterLName;
	}
	
	public String getEnterNumber() {
		return enterNumber;
	}
	
	
	
	private final static String menuFinderNotFindContact =     "\n1.Новый поиск " +
														"\n2.Exit " ;
	private final static String menuDeleter = "";
	private final static String menuChange = "";
	private final static String menuWriterStart = "";
	private final static String instruction1 = "Для работы со мной, выберите нужный пункт в меню: ";
	private final static String instruction2 = "\nВозвращаюсь назад <= ";
	private final static String instruction3 = "\nНе существует такого пункта.";
	
	public String getInstruction3() {
		return instruction3;
	}
	
	public String getInstruction2() {
		return instruction2;
	}
	
	public String getMenuFinderStart() {
		return menuFinderStart;
	}
	
	public String getInstruction1() {
		return instruction1;
	}
	
	public String getGreeting() {
		return greeting;
	}
	
	public String getMenuStart() {
		return menuStart;
	}
	
	public String getMenuReaderStart() {
		return menuReaderStart;
	}
	
	public String getMenuChange() {
		return menuChange;
	}
	
	public String getMenuWriterStart() {
		return menuWriterStart;
	}
	
	public String getPhonebookUpdate() {
		return phonebookUpdate;
	}
}
