package com.gmail.slartua.shape.data;

import com.gmail.slartua.shape.entity.Circle;
import com.gmail.slartua.shape.entity.Rectangel;
import com.gmail.slartua.shape.entity.Shape;
import com.gmail.slartua.shape.entity.Triangle;

public class DataSource {
	public static Shape[] getShapes() {
		return new Shape[] {
				new Triangle(4.0, 7.0, Colors.RED.getColorCode()),
				new Circle(5.0, Colors.ORANGE.getColorCode()),
				new Rectangel(7.0, 3.0, Colors.YELLOW.getColorCode()),
				new Triangle(1.0, 5.0, Colors.GREEN.getColorCode()),
				new Circle(5.0, Colors.BLUE.getColorCode()),
				new Rectangel(5.0, 3.0, Colors.INDIGO.getColorCode()),
				new Triangle(3.0, 5.0, Colors.VIOLET.getColorCode()),
				new Rectangel(4.0, 3.0, Colors.INDIGO.getColorCode()),
				new Circle(5.0, Colors.BLUE.getColorCode())
		};
	}
}
