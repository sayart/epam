package com.gmail.slartua.tours.model.entity;

public class Tour {
	private double price;
	private int days;
	private String country;
	private boolean allInclusive;
	private String transport;
	public Tour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tour(double price, int days, String country, boolean allInclusive, String transport) {
		super();
		this.price = price;
		this.days = days;
		this.country = country;
		this.allInclusive = allInclusive;
		this.transport = transport;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isAllInclusive() {
		return allInclusive;
	}
	public void setAllInclusive(boolean allInclusive) {
		this.allInclusive = allInclusive;
	}
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	
	
	
}
