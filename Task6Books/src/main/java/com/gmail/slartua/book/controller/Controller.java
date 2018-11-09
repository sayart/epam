package com.gmail.slartua.book.controller;

import com.gmail.slartua.book.data.DataSource;
import com.gmail.slartua.book.model.BooksDAO;
import com.gmail.slartua.book.model.BooksDAOTxtFileImplementation;
import com.gmail.slartua.book.model.BooksModel;
import com.gmail.slartua.book.model.entity.Book;
import com.gmail.slartua.book.view.View;

import java.io.IOException;

public class Controller {
	private BooksModel model = new BooksModel();
	private View view = new View();
	private BooksDAO booksDAO= new BooksDAOTxtFileImplementation();
	
	public void run() {
//		model.setBooks(DataSource.getBooks());
        setBookFromFile();
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
        saveBookInFile();

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

	private void setBookFromFile(){
	    while(true)
        try {
            model.setBooks(booksDAO.loadBooksFromFile(view.inputFilePath()));
            break;
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    private void saveBookInFile(){
        while(true)
        try {
            booksDAO.saveBooks(model.getBooks(), view.inputFilePathtoSave());
            System.out.println("File saved");
            break;
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
