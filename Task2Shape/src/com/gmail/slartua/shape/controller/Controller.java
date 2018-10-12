package com.gmail.slartua.shape.controller;

import com.gmail.slartua.shape.data.DataSource;
import com.gmail.slartua.shape.model.ShapeModel;
import com.gmail.slartua.shape.view.View;

public class Controller {
	private View view = new View();
	private ShapeModel model = new ShapeModel();
	
	public void run() {
		model.setShapes(DataSource.getShapes());
		view.printShapes("Shapes database", model.getShapes());
		view.printResult("\nTotal area =", model.getTotalArea());
		view.printResult("\nTotal area of triangles =", model.getTotalAreaByType(1));
		view.printShapes("\nSort by area:", model.sortByArea());
		view.printShapes("\nSort by color", model.sortByColor());
		view.draw("draw all shapes", model.getShapes());
	}
}
