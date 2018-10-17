package com.gmail.slartua.toys.data;

import java.util.ArrayList;

import com.gmail.slartua.toys.entity.*;

public class DataSource {
	public static ArrayList<Toy> getToys(){
		return new ArrayList<Toy>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
//			add(new Quadcopter("xiomi", 7, 1000, 100, "white", true));
			add(new Lego(5, 1225.2, 120));
			add(new Lego(3, 360.2, 50));
			add(new Car("Ferrary", 5, 200, 20, "Black", 27));
			add(new WoodConstructor("Woody", 3, 200.6, 100));
			add(new MetalConstructor("Steel", 12, 1002, 50, 10));
			add(new WoodConstructor("Woodys", 3, 200.6, 130));
			add(new WoodConstructor("Wood", 9, 120.6, 20));
			add(new Car("Mers", 7, 250.6, 100, "Red", 27));
			add(new Lego(5, 2260.2, 150));
			add(new Car("Ferrary", 3, 300, 30, "Black", 30));
		}};
	}
}
