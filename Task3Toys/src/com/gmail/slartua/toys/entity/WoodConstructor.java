package com.gmail.slartua.toys.entity;

public class WoodConstructor extends Constructor {
	private String packDimensions;
	final static private String material = "Wood";
	
	public WoodConstructor() {
		super();
	}
	public WoodConstructor(String brandName, int ageFrom, double price, int numberOfDetails) {
		super(brandName, ageFrom, price, numberOfDetails, material);
		// TODO Auto-generated constructor stub
	}
	
	public String getPackDimensions() {
		return packDimensions;
	}

	public void setPackDimensions(String packDimensions) {
		this.packDimensions = packDimensions;
	}

	@Override
	public String toString() {
		return super.toString() + this.getClass().getSimpleName() + "packDimensions=" + packDimensions + "]";
	}

}
