package com.gmail.slartua.book.view;

import java.util.Scanner;

import com.gmail.slartua.book.model.entity.Book;

public class View {
	public static final String INPUT_SELECT_MENU = "Input 1 - to get books by author \n"
			+ "Input 2 - to get books by publisher \n" + "Input 3 - to get book from year \n"
			+ "Input 4 - to sort by publisher";
	public static final String INPUT_PUBLISHER = "Input publisher";
	public static final String INPUT_AUTHOR = "Input author";
	public static final String INPUT_YEAR = "Input year";
	public static final String ERROR_MENU_SELECT = "Wrong menu!!!\n";
	public static final String ERROR_YEAR = "Wrong year, input integer number";

	Scanner scanner = new Scanner(System.in);

	public void printBook(String message, Book[] books) {
		System.out.println(message);
		for (Book book : books) {
			System.out.println(book);
		}
	}

	public void printMessage(String message) {
		System.out.println(message);
	}

	public int inputMenu() {
		int value = 0;
		printMessage(View.INPUT_SELECT_MENU);
		while (true) {
			value = scanner.nextInt();
			if (value < 1 || value > 4) {
				printMessage(View.ERROR_MENU_SELECT + " " + View.INPUT_SELECT_MENU);
				scanner.next();
			}
			return value;
		}
	}
	public int inputYear() {
		printMessage(View.INPUT_YEAR);
		while (!scanner.hasNextInt()) {
			printMessage(View.ERROR_YEAR + View.INPUT_YEAR);
			scanner.next();
		}
		return scanner.nextInt();
	}
	public String inputAuthor() {
		printMessage(View.INPUT_AUTHOR);
		scanner.nextLine();
		return scanner.nextLine();
	}
	public String inputPublisher() {
		printMessage(View.INPUT_PUBLISHER);
		scanner.nextLine();
		return scanner.nextLine();
	}
	
	
}
