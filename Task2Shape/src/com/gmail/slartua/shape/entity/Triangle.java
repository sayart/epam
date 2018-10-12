package com.gmail.slartua.shape.entity;

public class Triangle extends Shape {
	private double baseLength;
	private double height;
	
	public Triangle() {
		super();
	}
	public Triangle(double baseLength, double height, String shapeColor) {
		super(shapeColor);
		this.baseLength = baseLength;
		this.height = height;
	}
	
	public double getBaseLength() {
		return baseLength;
	}
	public void setBaseLength(double baseLength) {
		this.baseLength = baseLength;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public void draw() {
		int h = 1 + (int) height;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < 2 * h - 1; j++) {
				if (j <= h - 2 - i || j >= h + i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	@Override
	public double calcArea() {
		return (baseLength * height) / 2;
	}
	@Override
	public String toString() {
		return "Triangle [baseLength=" + baseLength + ", height=" + height + ", shapeColor=" + shapeColor
				+ ", Area=" + calcArea() + "]";
	}
		
}
