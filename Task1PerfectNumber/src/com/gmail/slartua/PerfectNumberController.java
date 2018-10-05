package com.gmail.slartua;

public class PerfectNumberController {
	private PerfectNumberModel model;
	private PerfectNumberView view;

	public PerfectNumberController(PerfectNumberModel model, PerfectNumberView view) {
		super();
		this.model = model;
		this.view = view;
	}

	public PerfectNumberController() {
		super();
	}

	public void findPefectNumbers() {
		model.setValue(InputUtility.inputPositiveIntValueWithScanner(view));
		if (model.getValue() < model.findFirstPerfectNumber()) {
			view.printMessage(PerfectNumberView.OUR_NONE_PERFECT_NUMBERS);
		} else {
			view.printMessageAndResult(PerfectNumberView.OUR_PERFECT_NUMBERS, model.getAllPerfectNumbers());
		}
	}
}
