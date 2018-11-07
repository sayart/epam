package com.gmail.slartua.book.model;

import com.gmail.slartua.book.model.entity.Book;

import java.io.*;

public class BooksDAOTxtFileImplementation implements BooksDAO {

    public BooksDAOTxtFileImplementation() {
        super();
    }

    @Override
    public void saveBooks(BooksModel booksModel, String filePathName){
        PrintWriter printWriter = new PrintWriter(new File(filePathName));
        for(Book book : booksModel.getBooks()){
            if (book != null) {
                printWriter.println(book.getTitle() + "," +
                        book.getAuthor() + "," +
                        book.getPublisher() + "," +
                        book.getYear() + "," +
                        book.getPages() + "," +
                        book.getPrice());
            }
        }

    }

    @Override
    public Book[] loadBooksFromFile(String filePathName)throws IOException{
        Book[] temp = new Book[countBooksInFile(filePathName)];
        BufferedReader br = new BufferedReader(new FileReader(new File(filePathName)));
        String text = "";
        int count = 0;
        for(; (text = br.readLine()) !=null;){
            String[] booksDate = text.split(",");
            String title = booksDate[0];
            String author = booksDate[1];
            String publisher = booksDate[2];
            int year = Integer.valueOf(booksDate[3]);
            int pages = Integer.valueOf(booksDate[4]);
            double price = Double.valueOf(booksDate[5]);
            Book book = new Book(title, author, publisher, year, pages, price);
            temp[count] = book;
            count++;
        }
        return temp;
    }

    private int countBooksInFile(String filePathName) throws IOException{
        InputStream is = new BufferedInputStream(new FileInputStream(filePathName));
        byte[] c = new byte[1024];
        int count = 0;
        int readChars = 0;
        boolean empty = true;
        while ((readChars = is.read(c)) != -1) {
            empty = false;
            for (int i = 0; i < readChars; ++i) {
                if (c[i] == '\n') {
                    ++count;
                }
            }
        }
        return (count == 0 && !empty) ? 1 : count;
    }
}
