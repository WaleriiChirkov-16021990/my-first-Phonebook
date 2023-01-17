package com.wch.ProjectPhonebook.Models;

import com.wch.ProjectPhonebook.Presenter.ViewConsole.Printer;
import com.wch.ProjectPhonebook.UInput.UInputConsole.UInCon;
import com.wch.ProjectPhonebook.UInterface.UIConsole.UInterfaceCon;

import java.util.ArrayList;

public class AddNewContact extends Contact {
	private UInCon uInCon;
	
	public UInCon getuInCon() {
		return uInCon;
	}
	
	public void setuInCon(UInCon uInCon) {
		this.uInCon = uInCon;
	}
	
	public AddNewContact(String firstName, String lastName, String date, int number, String commentary) {
		super(firstName, lastName, date, number, commentary);
		this.uInCon = new UInCon();
	}
	
	public AddNewContact(String firstName, String lastName, String date, int number1, int number2, int number3, String commentary) {
		super(firstName, lastName, date, number1, number2, number3, commentary);
		this.uInCon = new UInCon();
	}
	
	public AddNewContact(String firstName, String lastName, String date, int number1, int number2, String commentary) {
		super(firstName, lastName, date, number1, number2, commentary);
		this.uInCon = new UInCon();
	}
	
	public AddNewContact() {
		this.uInCon = new UInCon();
	}
	
	public void add(ArrayList<Contact> data) {
		data.add(this);
	}
	
	public void enterNewContact() {
		uInCon.UInput(new UInterfaceCon().getEnterFName());
		super.getName().setFirstName(uInCon.getInput());
		uInCon.UInput(new UInterfaceCon().getEnterLName());
		super.getName().setLastName(uInCon.getInput());
		while (true) {
		uInCon.UInput(new UInterfaceCon().getEnterDateBtsd());
			if (uInCon.isDate()) {
				super.setDateOfBirth(uInCon.getInput());
				break;
			} else {
				new Printer(new UInterfaceCon().getIsNotDate()).print();
			}
		}
		while (true) {
			uInCon.UInput(new UInterfaceCon().getEnterNumber());
			if (uInCon.isInteger()) {
				super.getNumber().setNumberHome(Integer.parseInt(uInCon.getInput()));
				break;
			} else {
				new Printer(new UInterfaceCon().getIsNotNumber()).print();
			}
		}
//		Не будем мучать пользователя вводом.
//		uInCon.UInput(new UInterfaceCon().getEnterNumberwork());
//		super.getNumber().setNumberWork(Integer.parseInt(uInCon.getInput()));
//		uInCon.UInput(new UInterfaceCon().getEnterNumberMob());
//		super.getNumber().setNumberMobile(Integer.parseInt(uInCon.getInput()));
		uInCon.UInput(new UInterfaceCon().getEnterComment());
		super.getCommentary().setComment(uInCon.getInput());
	}
}
