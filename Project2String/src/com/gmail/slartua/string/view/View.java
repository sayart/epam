package com.gmail.slartua.string.view;

import java.util.Scanner;

public class View {
	public static final String INPUT_FILEPATH = "Input filepath";
	public static final String WRONG_FILEPATH = "Wrong filepath, as an example:\n" +
			"D:\\Java\\epam_course\\epam\\Project2String\\file.txt";
	
	Scanner scanner = new Scanner(System.in);
	
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public String inputFilePath(){
		String value;
		while(true){
			printMessage(View.INPUT_FILEPATH);
			if(scanner.hasNextLine()){
				value = scanner.nextLine();
				if(value.matches("[A-Z]:(\\\\.*)*.*\\.txt"))
					break;
			} else scanner.next();
			printMessage(WRONG_FILEPATH);
		}
		return value;
	}
	
}
