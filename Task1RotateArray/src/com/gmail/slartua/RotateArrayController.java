package com.gmail.slartua;

public class RotateArrayController {
	private RotateArrayModel model;
	private RotateArrayView view;

	public RotateArrayController(RotateArrayModel model, RotateArrayView view) {
		super();
		this.model = model;
		this.view = view;
	}

	public RotateArrayController() {
		super();
	}

	public void draw() {
		model.setArraySize(InputUtility.inputPositiveIntValueWithScanner(view));
		int[][] array = model.generateArray();
		view.drawArray(array);
		view.printMessage(RotateArrayView.OUR_ROTATE_90_DEGREE);
		view.drawArray(model.rotateArrayCounterClockWise(array));
	}

}
