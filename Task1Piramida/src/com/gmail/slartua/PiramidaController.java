package com.gmail.slartua;

public class PiramidaController {
	private PiramidaModel model;
	private PiramidaView view;
	public PiramidaController(PiramidaModel model, PiramidaView view) {
		super();
		this.model = model;
		this.view = view;
	}
	public PiramidaController() {
		super();
	}
	public void draw() {
		model.setHeight(InputUtility.inputPositiveIntValueWithScanner(view));
		model.drawPiramid();
	}
	
	
}
