package com.gmail.slartua;

public class PerfectNumberView {
	public static final String INPUT_INT_DATA = "Enter range from 1 to  ";
	public static final String WRONG_INT_DATA = "Wrong input! Repeat please! Enter positive integer number ";
	public static final String OUR_PERFECT_NUMBERS = "All perfect numbers: ";
	public static final String OUR_NONE_PERFECT_NUMBERS = "None perfect numbers in such range";

	public void printMessage(String message) {
		System.out.println(message);
	}
	public void printMessageAndResult(String message, String result) {
		System.out.println(message + result);
	}
}
