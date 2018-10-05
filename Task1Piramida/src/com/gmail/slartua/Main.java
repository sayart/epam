package com.gmail.slartua;

public class Main {

	public static void main(String[] args) {
		PiramidaController pc = 
				new PiramidaController(new PiramidaModel(), new PiramidaView());
		pc.draw();
		
	}

}
