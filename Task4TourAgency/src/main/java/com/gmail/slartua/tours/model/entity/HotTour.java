package com.gmail.slartua.tours.model.entity;

public class HotTour extends Tour{
	private int discount;
	private double newPrice;
	
	public HotTour() {
		super();
	}
	public HotTour(double price, int days, String country, boolean allInclusive, String transport, int discount) {
		super(price, days, country, allInclusive, transport);
		this.discount = discount;
		this.newPrice = price - (price * discount / 100);
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public double getNewPrice() {
		return newPrice;
	}
	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}

	@Override
	public String toString() {
		return super.toString() +
				"discount=" + discount +
				", newPrice=" + newPrice +
				'}';
	}
}
