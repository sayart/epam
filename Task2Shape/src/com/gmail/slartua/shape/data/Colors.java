package com.gmail.slartua.shape.data;

public enum Colors {
	RED("#FF0000"), ORANGE("#FFA500"), YELLOW("#FFFF00"), GREEN("#008000"), BLUE("#0000FF"), INDIGO("#4B0082"), VIOLET(
			"#EE82EE");
	private String colorCode;

	private Colors(String colorCode) {
		this.colorCode = colorCode;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}
}
