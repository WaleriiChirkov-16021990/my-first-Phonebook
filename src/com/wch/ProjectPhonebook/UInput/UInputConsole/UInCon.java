package com.wch.ProjectPhonebook.UInput.UInputConsole;

import java.util.Scanner;

public class UInCon {
	private Scanner scanner = new Scanner(System.in);
	private String input = null;
	
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
	
	public void UInput (String s){
		System.out.printf("%s ", s);
		setInput(scanner.nextLine());
	}
}
