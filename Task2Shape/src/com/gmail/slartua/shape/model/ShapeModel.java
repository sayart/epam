package com.gmail.slartua.shape.model;

import java.util.Arrays;
import java.util.Comparator;
import com.gmail.slartua.shape.entity.*;

public class ShapeModel {
	private Shape[] shapes;

	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}
	
	public double getTotalArea() {
		double totalArea = 0;
		for (int i = 0; i < shapes.length; i++) {
			totalArea += shapes[i].calcArea();
		}
		return totalArea;
	}
	
	public double getTotalAreaByType(int type) {
		double totalArea = 0;
		switch(type) {
		case 1: 
			for (int i = 0; i < shapes.length; i++) {
				if(shapes[i] instanceof Triangle)
				totalArea += shapes[i].calcArea();
			}
			break;
		case 2:
			for (int i = 0; i < shapes.length; i++) {
				if(shapes[i] instanceof Rectangel)
				totalArea += shapes[i].calcArea();
			}
			break;
		case 3:
			for (int i = 0; i < shapes.length; i++) {
				if(shapes[i] instanceof Circle)
				totalArea += shapes[i].calcArea();
			}
			break;
		}
		return totalArea;
	}
	
	public Shape[] sortByArea() {
		Shape[] temp = new Shape[shapes.length];
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			temp[count++] = shapes[i];
		}
		Arrays.sort(temp, new Comparator<Shape>() {
			@Override
			public int compare(Shape a, Shape b) {
				Shape shapeOne = a;
				Shape shapeTwo = b;
				return (shapeOne.calcArea() > shapeTwo.calcArea()) ? -1 : 1;
			}
		});
		return Arrays.copyOf(temp, count);
	}
	
	public Shape[] sortByColor() {
		Shape[] temp = new Shape[shapes.length];
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			temp[count++] = shapes[i];
		}
		Arrays.sort(temp, new Comparator<Shape>() {
			@Override
			public int compare(Shape a, Shape b) {
				Shape shapeOne = a;
				Shape shapeTwo = b;
				return (shapeOne.getShapeColor().compareToIgnoreCase(shapeTwo.getShapeColor()));
			}
		});
		return Arrays.copyOf(temp, count);
	}
		
}
