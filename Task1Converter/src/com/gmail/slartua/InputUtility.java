package com.gmail.slartua;

import java.util.Scanner;

public class InputUtility {
	private static Scanner sc = new Scanner(System.in);

	public static int inputPositiveIntValueWithScanner(ConverterView view) {
		view.printMessage(ConverterView.INPUT_INT_DATA);

		while (!sc.hasNextInt()) {
			view.printMessage(ConverterView.WRONG_INT_DATA + ConverterView.INPUT_INT_DATA);
			sc.next();
		}
		int i = sc.nextInt();
		if (i > 0) {
			return i;
		} else {
			view.printMessage(ConverterView.WRONG_INT_DATA + ConverterView.INPUT_INT_DATA);
			sc.next();
		}
		return sc.nextInt();

	}
}
