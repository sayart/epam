package com.gmail.slartua;

public class Main {

	public static void main(String[] args) {
		PerfectNumberController controller = 
				new PerfectNumberController(new PerfectNumberModel(), new PerfectNumberView());
		controller.findPefectNumbers();
	}

}
