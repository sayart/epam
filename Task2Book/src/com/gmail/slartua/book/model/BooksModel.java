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
			if (books[i].getAuthor().equals(author)) {
				temp[count++] = books[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public Book[] getByPublisher(String publisher) {
		Book[] temp = new Book[books.length];
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (books[i].getPublisher().equals(publisher)) {
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
		Arrays.sort(temp, new BookComparator(1));
		return Arrays.copyOf(temp, count);
	}
	
	public Book[] sortByPublisher() {
		Book[] temp = new Book[books.length];
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			temp[count++] = books[i];
		}
		Arrays.sort(temp, new BookComparator(2));
		return Arrays.copyOf(temp, count);
	}
	
	
	
}
