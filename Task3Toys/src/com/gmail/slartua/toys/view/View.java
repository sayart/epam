package com.gmail.slartua.toys.view;

import java.util.ArrayList;
import com.gmail.slartua.toys.entity.*;

public class View {
	
	public void printResult(String message, double result) {
		System.out.println(message + result);
	}
	
	public void printToys(String message, ArrayList<Toy> toys) {
		System.out.println(message);
		for (Toy toy : toys) {
//			if(toy != null) {
				System.out.println(toy);
//			}
		}
	}
	
}
