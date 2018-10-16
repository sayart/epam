package com.gmail.slartua.toys.entity;

public class Lego extends Constructor {
	final private String type = "Duplo";
	final private static String material = "Plastic";
		
	public Lego() {
		super();
	}
	
	
	public Lego(String brandName, int ageFrom, double price, int numberOfDetails) {
		super(brandName, ageFrom, price, numberOfDetails, material);
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return super.toString() + this.getClass().getSimpleName() + " type=" + type + "]";
	}
	
	
}
