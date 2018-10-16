package com.gmail.slartua.toys.entity;

public class Toy {
	private String brandName;
	private int ageFrom;
	private double price;
	public Toy() {
		super();
	}
	public Toy(String brandName, int ageFrom, double price) {
		super();
		this.brandName = brandName;
		this.ageFrom = ageFrom;
		this.price = price;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getAgeFrom() {
		return ageFrom;
	}
	public void setAgeFrom(int ageFrom) {
		this.ageFrom = ageFrom;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [brandName=" + brandName + ", ageFrom=" + ageFrom + ", price=" + price + "]";
	}
	
	
	
}
