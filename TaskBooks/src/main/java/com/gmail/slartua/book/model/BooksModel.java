package com.gmail.slartua.book.model;

import java.util.Arrays;

import com.gmail.slartua.book.model.entity.Book;

/**
 * Class with field <b>books</b>
 * @author Slobodyanyuk Artem
 * @version 1.0.0
 *
 */
public class BooksModel {
	/**
	 * Field books
	 */
	private Book[] books;

	/**
	 * Getter to field {@link #books}
	 * @return return books array
	 */
	public Book[] getBooks() {
		return books;
	}

	/**
	 * Set to field {@link #books}
	 * @param books set this
	 */
	public void setBooks(Book[] books) {
		this.books = books;
	}

	/**
	 * Get boooks of an current author in book array
	 * @param author - search by this author
	 * @return return book array of an author
	 */
	public Book[] getByAuthor(String author) {
		Book[] temp = new Book[books.length];
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (books[i].getAuthor().equalsIgnoreCase(author)) {
				temp[count++] = books[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}

	/**
	 * Get books of a current publisher in book array
	 * @param publisher - search by this publisher
	 * @return book array of the publisher
	 */
	public Book[] getByPublisher(String publisher) {
		Book[] temp = new Book[books.length];
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (books[i].getPublisher().equalsIgnoreCase(publisher)) {
				temp[count++] = books[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}

	/**
	 * Get books from current year and newer
	 * @param year - get from this year
	 * @return - book array of current year and newer
	 */
	public Book[] getFromYear(int year) {
		Book[] temp = new Book[books.length];
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (books[i].getYear() >= year) {
				temp[count++] = books[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}

	/**
	 * Sort by publisher alphabetically
	 * @return - book array, sorting by publisher alphabetically
	 */
	public Book[] sortByPublisher() {
		Book[] temp = new Book[books.length];
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			temp[count++] = books[i];
		}
		Arrays.sort(temp, new BookComparator());
		return Arrays.copyOf(temp, count);
	}

//    public void add(Book addingBook) {
//        for (Book book : books) {
//            if (book == null) {
//                book = addingBook;
//            } else {
//                this.resize();
//                books[books.length] = addingBook;
//                return;
//            }
//        }
//    }
//
//    private void resize() {
//        Book[] temp = new Book[this.books.length *7 / 4 + 1];
//        System.arraycopy(books, 0, temp, 0, books.length);
//        books = temp;
//    }
		
}
