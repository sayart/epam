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
		switch(view.inputMenu()) {
		case 1:	searchBooksByAuthor(view.inputAuthor());
				break;
		case 2: searchBooksByPublisher(view.inputPublisher());
				break;
		case 3: searchBooksFromYear(view.inputYear());
				break;
		case 4: view.printBook("Sort by publisher:", model.sortByPublisher());
		}
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
	private void searchBooksByPublisher(String publisher) {
		Book[] result = model.getByPublisher(publisher);
		if(result.length == 0) {
			view.printMessage("No books - " + publisher);
		} else {
			view.printBook("Publisher "  + publisher +":", result);
		}
	}
	private void searchBooksFromYear(int year) {
		Book[] result = model.getFromYear(year);
		if(result.length == 0) {
			view.printMessage("No books from " + year);
		} else {
			view.printBook("From "  + year +":", result);
		}
	}
}
