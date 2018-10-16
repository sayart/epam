package com.gmail.slartua.shape.entity;

public abstract class Shape implements Drawable {
	String shapeColor;

	public Shape() {
		super();
	}
	public Shape(String shapeColor) {
		super();
		this.shapeColor = shapeColor;
	}
	
	public String getShapeColor() {
		return shapeColor;
	}
	
	public void setShapeColor(String shapeColor) {
		this.shapeColor = shapeColor;
	}
	public abstract double calcArea();
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[shapeColor=" + shapeColor + "]";
	}
		
}
