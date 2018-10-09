package com.gmail.slartua.book.view;

import com.gmail.slartua.book.model.entity.Book;

public class View {		
	public void printBook(String message, Book[] books) {
		System.out.println(message);
		for (Book book : books) {
			System.out.println(book);
		}
	}
	public void printMessage(String message) {
		System.out.println(message);
	}
}
