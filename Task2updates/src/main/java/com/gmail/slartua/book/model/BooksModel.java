package com.gmail.slartua.book.model;

import java.util.Arrays;

import com.gmail.slartua.book.model.entity.Book;

public class BooksModel {
	private Book[] books;


	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	public Book[] getByAuthor(String author) {
		Book[] temp = new Book[books.length];
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (books[i].getAuthor().equalsIgnoreCase(author)) {
				temp[count++] = books[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public Book[] getByPublisher(String publisher) {
		Book[] temp = new Book[books.length];
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (books[i].getPublisher().equalsIgnoreCase(publisher)) {
				temp[count++] = books[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public Book[] getFromYear(int year) {
		Book[] temp = new Book[books.length];
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (books[i].getYear() >= year) {
				temp[count++] = books[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public Book[] sortByPublisher() {
		Book[] temp = new Book[books.length];
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			temp[count++] = books[i];
		}
		Arrays.sort(temp, new BookComparator());
		return Arrays.copyOf(temp, count);
	}
	
//	public Book[] sortByMenuChoise() {
//		switch(inputMenuChoise) {
//			case 1: return getByAuthor(inputStringValue);
//			case 2: return getByPublisher(inputStringValue);
//			case 3: return getFromYear(inputYearValue);
//			case 4: return sortByPublisher();			
//		}
//		return this.books;
//	}
		
}
