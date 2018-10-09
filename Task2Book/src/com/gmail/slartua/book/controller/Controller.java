package com.gmail.slartua.book.controller;

import com.gmail.slartua.book.data.DataSource;
import com.gmail.slartua.book.model.BooksModel;
import com.gmail.slartua.book.model.entity.Book;
import com.gmail.slartua.book.view.View;

public class Controller {
	private BooksModel model = new BooksModel();
	private View view = new View();
	
	public void run() {
		model.setBooks(DataSource.getBooks());
		searchBooksByAuthor("Shevchenko");
		
		view.printBook("\nAll books:", model.getBooks());
		
		
		
	}
	
	private void searchBooksByAuthor(String author) {
		Book[] result = model.getByAuthor(author);
		if(result.length == 0) {
			view.printMessage("No books - " + author);
		} else {
			view.printBook("Author "  + author +":", result);
		}
	}
}
