package com.gmail.slartua.book.data;

import com.gmail.slartua.book.model.entity.Book;

public class DataSource {
	public static Book[] getBooks() {
		return new Book[] {
				new Book("Title1", "Shevchenko", "ABB", 2001, 102, 42.12),
				new Book("Title2", "Franko", "BBC", 2002, 12, 87.85),
				new Book("Title3", "Lesya", "CBC", 2000, 15, 87.12),
				new Book("Title4", "Skovoroda", "NBC", 2000, 223, 487.17),
				new Book("Title5", "Shevchenko", "FBC", 2001, 112, 245.12),
				new Book("Title6", "Shevchenko", "Ababagalamaga", 2000, 532, 445.12),
				new Book("Title7", "Sheva", "ABC", 2007, 24, 45.12),
				new Book("Title8", "Shevchenko", "ABC", 2002, 246, 145.12),
				new Book("Title9", "Shevchenko", "ABC", 2003, 144, 245.12)};
	}
}
