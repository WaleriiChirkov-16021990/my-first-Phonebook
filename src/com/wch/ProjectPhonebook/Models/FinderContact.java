package com.wch.ProjectPhonebook.Models;

import com.wch.ProjectPhonebook.Presenter.ViewConsole.Printer;
import com.wch.ProjectPhonebook.Presenter.ViewConsole.PrinterContact;
import com.wch.ProjectPhonebook.UInput.UInputConsole.UInCon;
import com.wch.ProjectPhonebook.UInterface.UIConsole.UInterfaceCon;

import java.util.ArrayList;

public class FinderContact extends Contact{
	private UInCon u = new UInCon();
	private Contact finder = new Contact();
	
	public FinderContact(){
		String tempInput;
		while (true) {
			new UInterfaceCon().getMenuFinderStart();
			u.UInput(new UInterfaceCon().getInstruction1());
			if (u.getInput().equals("1")) {
				u.UInput(new UInterfaceCon().getEnterFName());
				finder.getName().setFirstName(u.getInput());
			} else if (u.getInput().equals("2")) {
				u.UInput(new UInterfaceCon().getEnterLName());
				finder.getName().setLastName(u.getInput());
			} else if (u.getInput().equals("3")) {
				u.UInput(new UInterfaceCon().getEnterNumber());
				finder.getNumber().setNumberHome(Integer.parseInt(u.getInput()));
			} else if (u.getInput().equals("4")) {
				new Printer(new UInterfaceCon().getInstruction2()).print();
				break;
			}
		}
	}
	
	public boolean searchContact(ArrayList<Contact> data){
		return data.contains(this.finder)? true:false;
	}
	
	public void showContact(ArrayList<Contact> data, int num) {
		for (Contact c: data
		     ) {
			if (num == 1 || num == 2) {
				if (c.getName().getFirstName().equals(this.finder.getName().getFirstName())) {
					new PrinterContact(c).printCtc();
				} else if (c.getName().getLastName().equals(this.finder.getName().getLastName())) {
					new PrinterContact(c).printCtc();
				}
			} else if (num == 3) {
				if (c.getNumber().getNumberHome() == this.finder.getNumber().getNumberHome()) {
					new PrinterContact(c).printCtc();
				} else if (c.getNumber().getNumberMobile() == this.finder.getNumber().getNumberMobile()) {
					new PrinterContact(c).printCtc();
				} else if (c.getNumber().getNumberWork() == this.finder.getNumber().getNumberWork()) {
					new PrinterContact(c).printCtc();
				}
			}
		}
	}
	
	
	
	
}
