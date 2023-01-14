package com.wch.ProjectPhonebook.UInput.UInputConsole;

import java.util.Scanner;

public class UInCon {
	Scanner scanner = new Scanner(System.in);
	String input = null;
	
	public UInCon(String input) {
		this.input = input;
	}
	
	public UInCon() {
	}
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public String getInput() {
		return input;
	}
	
	public void UInput (){
		System.out.print("Требуется ввод: ");
		setInput(scanner.nextLine());
	}
}
