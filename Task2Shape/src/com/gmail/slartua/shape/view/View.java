package com.gmail.slartua.shape.view;

import com.gmail.slartua.shape.entity.Shape;

public class View {
	
	public void printResult(String message, double result) {
		System.out.println(message + result);
	}
	
	public void printShapes(String message, Shape[] shapes) {
		System.out.println(message);
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}

	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public void draw(String message, Shape[] shapes) {
		System.out.println(message);
		for (Shape shape : shapes) {
			shape.draw();
			System.out.println();
		}
	}
}
