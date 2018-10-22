package com.gmail.slartua.toys.controller;

import com.gmail.slartua.toys.data.DataSource;
import com.gmail.slartua.toys.entity.*;
import com.gmail.slartua.toys.model.GameRoomModel;
import com.gmail.slartua.toys.view.View;

public class Controller {
	private GameRoomModel<Toy> model = new GameRoomModel<Toy>();
	private View view = new View();
	
	public void run() {
		model.setGameRoom(DataSource.getToys());
		view.printToys("Sort from age 5", model.sortFromAge(5));
		view.printResult("\nTotal price: ", model.totalPrice());
		view.printToys("\nSort by price from 200 to 500", 
		model.sortByPrice(200, 500));
	}
}
