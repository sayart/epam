package com.gmail.slartua;

public class ConverterView {
	public static final String INPUT_INT_DATA = "Enter positive integer number =";
	public static final String WRONG_INT_DATA = "Wrong input! Repeat please! ";
	public static final String OUR_BIN = "bin = ";
	public static final String OUR_OCT = "oct = ";
	public static final String OUR_HEX = "hex = ";
	public static final String OUR_DEC = "dec = ";
	
	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printMessageAndResult(String message, String result) {
		System.out.println(message + result);
	}
}
