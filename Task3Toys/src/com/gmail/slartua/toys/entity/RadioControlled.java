package com.gmail.slartua.toys.entity;

public class RadioControlled extends Toy{
	private int range;
	private String color;
	public RadioControlled() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RadioControlled(String brandName, int ageFrom, double price, int range, String color) {
		super(brandName, ageFrom, price);
		this.range = range;
		this.color = color;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return  super.toString() + this.getClass().getSimpleName() + "range=" + range + ", color=" + color + "]";
	}
		
}
