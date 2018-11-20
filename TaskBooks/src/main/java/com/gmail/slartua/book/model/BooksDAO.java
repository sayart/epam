package com.gmail.slartua.book.model;

import com.gmail.slartua.book.model.entity.Book;

import java.io.IOException;

public interface BooksDAO {

    public void saveBooks(Book[] books, String filePathName) throws IOException;

    public Book[] loadBooksFromFile(String filePathName) throws IOException;
}
