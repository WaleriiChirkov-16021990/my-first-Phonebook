package com.wch.ProjectPhonebook.UInterface.UIConsole;

public class UInterfaceCon {
	private final String greeting = "Добро пожаловать в телефонный справочник.";
	private final String menuStart =    "\n1.Загрузить новую книгу из файла  " +
										"\n2.Просмотреть текущую книгу  " +
										"\n3.Найти контакт  " +
										"\n4.Удалить контакт  " +
										"\n5.Изменить контакт  " +
										"\n6.Записать тукущую внигу в файл " +
										"\n7.Exit" ;
	private final String menuReaderStart =          "\n1.Загрузить из файла 1 " +
													"\n2.Загрузить из файла 2 " +
													"\n3.Выйти в главное меню" ;
	private final String menuFinderStart =  "\n1.Поиск по имени  " +
											"\n2.Поиск по фамилии  " +
											"\n3.Поиск по телефону  " +
											"\n4.Exit" ;
	private final String menuFinderFindContact =    "\n1.Позвонить  " +
													"\n2.Изменить  " +
													"\n3.Удалить  " +
													"\n4.Новый поиск " +
													"\n5.Exit ";
	
	private final String enterFName = "\n1.Введите имя : ";
	private final String enterLName = "\n1.Введите фамилию : ";
	private final String enterNumber = "\n1.Введите телефон : ";
	private final String closeApplication = "\nПрограмма завершена.";
	
	public String getCloseApplication() {
		return closeApplication;
	}
	
	public String getEnterFName() {
		return enterFName;
	}
	
	public String getEnterLName() {
		return enterLName;
	}
	
	public String getEnterNumber() {
		return enterNumber;
	}
	
	
	
	private final String menuFinderNotFindContact =     "\n1.Новый поиск " +
														"\n2.Exit " ;
	private final String menuDeleter = "";
	private final String menuChange = "";
	private final String menuWriterStart = "";
	private final String instruction1 = "Для работы со мной, выберите нужный пункт в меню: ";
	private final String instruction2 = "Возвращаюсь назад <= ";
	
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
}
