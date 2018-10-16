package com.gmail.slartua.shape.entity;

public class Rectangel extends Shape {
	private double width;
	private double height;
	
	public Rectangel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rectangel(double width, double height, String shapeColor) {
		super(shapeColor);
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void draw() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	@Override
	public double calcArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return super.toString() +
				this.getClass().getSimpleName()+
				"[width=" + width + ", height=" + height + ", Area=" + calcArea() + "]";
	}


	

}
