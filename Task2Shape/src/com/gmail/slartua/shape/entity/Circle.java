package com.gmail.slartua.shape.entity;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double radius, String shapeColor) {
		super(shapeColor);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("this is small circle -> o");
	}
	@Override
	public double calcArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return super.toString() +
				" [radius=" + radius + 
				", Area=" + calcArea() + "]";
	}
	
	

}
