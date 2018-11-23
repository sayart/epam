package com.epam.task61.service;

import com.epam.task61.model.Books;
import com.epam.task61.model.data.DataSource;
import com.epam.task61.model.entity.Book;
import com.epam.task61.util.InputOutputFile;

import java.util.Arrays;
import java.util.Comparator;

public class ServiceBooks {
    private Books model = new Books();

    public ServiceBooks() {
//        model.setBooks(DataSource.getBooks());
        model.setBooks(InputOutputFile.load());
    }

    public String showAllBooks() {
        return convertBooksInString(model.getBooks());
    }

    private String convertBooksInString(Book[] books) {
        StringBuilder str = new StringBuilder();
        for (Book book : books ) {
            str.append(book);
            str.append("\n");
        }
        return str.toString();
    }

    public String searchBooksByAuthor(String author){
        Book[] books = model.getByAuthor(author);
        if (books.length == 0) {
            return "No books for : " + author;
        }
        return "Books with author: " + author + "\n"
                + convertBooksInString(books);
    }

    public String searchBooksByPublisher(String publisher){
        Book[] books = model.getByPublisher(publisher);
        if (books.length == 0) {
            return "No books for : " + publisher;
        }
        return "Books with publisher:" + publisher
                + "\n" + convertBooksInString(books);
    }

    public String searchBooksAfterYear(int year){
        Book[] books = model.getAfterYear(year);
        if (books.length == 0) {
            return "No books after : " + year + " year";
        }
        return "Books after " + year + " year:\n"
                + convertBooksInString(books);
    }

    public String sortByPublisher() {
        Book[] books = model.getBooks();
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublish().compareTo(o2.getPublish());
            }
        });
        return convertBooksInString(books);
    }

    public void saveBooks() {
        InputOutputFile.save(model.getBooks());
    }
}
