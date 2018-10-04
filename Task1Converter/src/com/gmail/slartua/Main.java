package com.gmail.slartua;

public class Main {

	public static void main(String[] args) {
		ConverterController controller = 
				new ConverterController(new ConverterModel(), new ConverterView());
		controller.convert();
	}

}
