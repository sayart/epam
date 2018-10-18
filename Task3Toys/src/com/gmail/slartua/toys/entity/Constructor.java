package com.gmail.slartua.toys.entity;

public class Constructor extends Toy {
	private int numberOfDetails;
	private String material;
	
	public Constructor() {
		super();
	}
	public Constructor(String brandName, int ageFrom, double price, int numberOfDetails, String material) {
		super(brandName, ageFrom, price);
		this.numberOfDetails = numberOfDetails;
		this.material = material;
	}
	public int getNumberOfDetails() {
		return numberOfDetails;
	}
	public void setNumberOfDetails(int numberOfDetails) {
		this.numberOfDetails = numberOfDetails;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return super.toString() +
				" numberOfDetails=" + numberOfDetails + ", material=" + material;
	}
}
