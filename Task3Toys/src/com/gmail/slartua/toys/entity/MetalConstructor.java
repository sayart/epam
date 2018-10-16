package com.gmail.slartua.toys.entity;

public class MetalConstructor extends Constructor{
	private double weight;
	final private static String material = "Metal";

	public MetalConstructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MetalConstructor(String brandName, int ageFrom, double price, int numberOfDetails, double weight) {
		super(brandName, ageFrom, price, numberOfDetails, material);
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return super.toString() + this.getClass().getSimpleName()+ " weight=" + weight + "]";
	}
	
	
	
}
