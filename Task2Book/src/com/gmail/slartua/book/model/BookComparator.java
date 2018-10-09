package com.gmail.slartua.book.model;

import java.util.Comparator;

import com.gmail.slartua.book.model.entity.Book;

public class BookComparator implements Comparator{
	private int i = 0;

	public BookComparator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookComparator(int i) {
		super();
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
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
		switch (this.i) {
		case 1:
			return bookOne.getYear() - bookTwo.getYear();
		case 2: 
			return (bookOne.getPublisher().compareToIgnoreCase(bookTwo.getPublisher()));			
		}
		return 0;
	}
	
	
}
