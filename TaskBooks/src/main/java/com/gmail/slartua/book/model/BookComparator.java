package com.gmail.slartua.book.model;

import java.util.Comparator;

import com.gmail.slartua.book.model.entity.Book;

public class BookComparator implements Comparator{
	public BookComparator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int compare(Object a, Object b) {
		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}
		Book bookOne = (Book) a;
		Book bookTwo = (Book) b;
		return (bookOne.getPublisher().compareToIgnoreCase(bookTwo.getPublisher()));			
	}
	
	
}
