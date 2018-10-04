package com.gmail.slartua;

public class ConverterController {
	private ConverterModel model;
	private ConverterView view;
	public ConverterController(ConverterModel model, ConverterView view) {
		super();
		this.model = model;
		this.view = view;
	}
	public ConverterController() {
		super();
	}
	public void convert() {
		model.setDecNumber(InputUtility.inputPositiveIntValueWithScanner(view));
		view.printMessageAndResult(ConverterView.OUR_DEC, model.toString());
		view.printMessageAndResult(ConverterView.OUR_BIN, model.convertToBin());
		view.printMessageAndResult(ConverterView.OUR_OCT, model.convertToOct());
		view.printMessageAndResult(ConverterView.OUR_HEX, model.convertToHex());
	}
	
	
}
