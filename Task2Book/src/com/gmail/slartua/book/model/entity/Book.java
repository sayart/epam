package com.gmail.slartua.book.model.entity;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private int year;
	private int pages;
	private double price;
	
	public Book() {
		super();
	}
//	@Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Book)) return false;
//
//        Book book = (Book) o;
//
//        if (year != book.year) return false;
//        if (pages != book.pages) return false;
//        if (Double.compare(book.price, price) != 0) return false;
//        if (!title.equals(book.title)) return false;
//        if (!author.equals(book.author)) return false;
//        return publisher.equals(book.publisher);
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = title.hashCode();
//        result = 31 * result + author.hashCode();
//        result = 31 * result + publisher.hashCode();
//        result = 31 * result + year;
//        result = 31 * result + pages;
//        temp = Double.doubleToLongBits(price);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }
	public Book(String title, String author, String publisher, int year, int pages, double price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", year=" + year
				+ ", pages=" + pages + ", price=" + price + "]";
	}
		
}
